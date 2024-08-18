//put method me record to complete update ker te he
//url  https://reqres.in/api/users/128
package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_Putmethod 
{
@Test
public void test04()
{
	JSONObject jsonData = new JSONObject();//json simple d=ki dependency se object create kiya he
	jsonData.put("name", "Pathak-Nikhil");
	jsonData.put("Job", "Mechanical");
	
	RestAssured.baseURI = "https://reqres.in/api/users/128";
	RestAssured.given().headers("Content-Type", "application/json").
	contentType(ContentType.JSON).
	body(jsonData.toJSONString()).
	when().put().
	then().statusCode(200).log().all();
}
}
