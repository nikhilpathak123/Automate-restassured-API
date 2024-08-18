package Session12;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Dserialization_Demo 
{
@Test
public void createuser()
{
	RequestSpecification Reqspec = RestAssured.given();
	//url: https://reqres.in/api/users
	
	Reqspec.baseUri("https://reqres.in");
	
	Reqspec.basePath("/api/users");
	
	JSONObject jsonData = new JSONObject();//json simple d=ki dependency se object create kiya he
	jsonData.put("name", "Nikhil-Chotu");
	jsonData.put("job", "QA");
	
	//send post request
	Response response = Reqspec.contentType(ContentType.JSON)
	.body(jsonData.toJSONString())
	.post();
	
	//print repsonse body
	ResponseBody responsebody = response.getBody();
	//String body = response.body().asString();
	
	//System.out.println("This is reponse body: " + body);
	
	//Deserlization resposne body i.e json resposne to class object
	//class t is the generic form of ant class of type T whoch is also refered as a template
	
	Json_Response responseclass = responsebody.as(Json_Response.class);
	
	Assert.assertEquals(responseclass.name, "Nikhil-Chotu", "Check for name");
	Assert.assertEquals(responseclass.job, "QA", "Check for job");
	
	
	
}
}