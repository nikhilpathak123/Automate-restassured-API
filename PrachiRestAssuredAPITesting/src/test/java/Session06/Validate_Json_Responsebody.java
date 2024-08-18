//JSON stand for javascript object Notation
// it is lightweight format to tranporting and storing data
//it is often use to send data from server to webpage
//it is easy to understand
//rules data format should be in key and value pair
//data is seperate by coma, {curly bracket is use to hold objet, [ square bracjket is for an array


package Session06;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Validate_Json_Responsebody 
{
	@Test
	public void userlistresponsebody()
	{
		//Get requestspecification reference (Requestspecification is a interface 
		
		RequestSpecification Regref = RestAssured.given();
		
		//Base URL and base path
		Regref.baseUri("https://reqres.in");
		Regref.basePath("/api/users?page=2");
		
		//Create Get request
		Response Response = Regref.get();
		
		//read response body
		ResponseBody ResponseBody = Response.getBody();
		
		//response return string then we have as string method
		String Responsestring = ResponseBody.asPrettyString();
		
		//print the response body sgring
		//System.out.println(Responsestring);
		
		//Check and validate for the presence of george in resposne string
		// user assert method which return true value
		//user contenttype method 
		
		//Assert.assertEquals(Responsestring.contains("George"), true);
		
		//Validate jsonpath
		//x.data[1].email
		
		JsonPath jsonpathview = ResponseBody.jsonPath();
		
		String email = jsonpathview.get("x.data[1].email");
		
		Assert.assertEquals(email, "janet.weaver@reqres.in");
		
		//System.out.println("This is email address: " + email);
		
		
		
		
		
		
		
	}

}
