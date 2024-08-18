package Session04;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

@Test (enabled = false)
public class Checkforvalidateresposne 
{
	public void Getsingleuser()
	{
		//specify the URI
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		
		//Get request specification of the request		
		RequestSpecification Requestspec = RestAssured.given();		
		
		//send get reuest and store resposne in variable
		Response Response = Requestspec.get();
		
		//get resposne code
		int statuscode = Response.getStatusCode();
		
		//validate actual status code with expected // hum yaha per assertion lagte he 
		
		Assert.assertEquals(statuscode, 200);
		
		//then().statusCode(200).log().all();
		
		}
	//upar ke method me hum ne assert statement use kiya he status code ko validate kerne ke liya hum validatable resposne
	// ko bhi user ker sakte he 
	@Test
 

		public void Getsingleuservalidatableresposne()
		{
			//specify the URI
			RestAssured.baseURI = "https://reqres.in/api/users/2";
			
			//Get request specification of the request		
			RequestSpecification Requestspec = RestAssured.given();		
			
			//send get reuest and store resposne in variable
			Response Response = Requestspec.get();
			
			//import validatable response code
			ValidatableResponse ValidRes =Response.then();
			
			//validate status code
			ValidRes.statusCode(200);
			
			
			
			

}
}
