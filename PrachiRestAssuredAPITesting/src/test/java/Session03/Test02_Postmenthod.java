package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Test02_Postmenthod 
{
	@Test
	public void test02()
	{
//url: https://reqres.in/api/users/
	
	JSONObject jsonData = new JSONObject();//json simple d=ki dependency se object create kiya he
	jsonData.put("name", "Nikhil-Pathak");
	jsonData.put("Job", "QA");
	
	RestAssured.baseURI = "https://reqres.in/api/users";
	RestAssured.given().headers("Content-Type", "application/json").
	contentType(ContentType.JSON).
	body(jsonData.toJSONString()).
	when().post().
	then().statusCode(201).log().all();
	
	//*Response {
   // "name": "Nikhil-Pathak",
   // "Job": "QA",
    //"id": "128",
    //"createdAt": "2024-04-13T05:05:35.662Z"*//
    
} 

	}

