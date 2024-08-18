package Session05;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Validate_Response_Header 
{
	@Test
	public void Getsinglesuer()
	{
		//Get request specification  
		RequestSpecification Req =RestAssured.given();
		
		// Get base URI
		//RestAssured.baseURI = "https://reqres.in/";
		Req.baseUri("https://reqres.in/");
		
		Req.basePath("/api/users/2");
		
		//send and get response
		
		Response Response = Req.get();
		
		//Validate header-> restassured me header validate ker sakte he 
		//1st Header srting me ju bhi header ke attribute ko pass kerge hume uska ke value return huga
		//content type ek string ke value return kerge ga ju kimhume storen kerne he
		
		String ContentType = Response.header("Content-Type");
		System.out.println("Value of content type: " + ContentType);
		
		//Assert.assertEquals("application/json; charset=utf-8", false);
		
		//application/json; charset=utf-8
		
		//Agar heard list ko print kerna hu to get headers ke import kerna huga
		
		Headers HeadersList = Response.getHeaders();
		//print the headerlist by using for each loop
		for (Header header:HeadersList)
		{
			System.out.println("Key: " + header.getName() + "Value: "+ header.getValue());
		
		}
		
	}

}
