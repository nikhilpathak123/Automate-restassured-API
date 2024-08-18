package Session07;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Query_parameter_Demo 
{
	@Test
	public void test01()
	{
		//Get Request Specification
		RequestSpecification Reqspec = RestAssured.given();

		//Get base URL
		Reqspec.baseUri("https://reqres.in");
		Reqspec.basePath("/api/users");
		Reqspec.queryParam("page", 2);

		//send or perform get request
		// store the rsposne in response variable

		Response response = Reqspec.get();

		//capture the resposne in string
		String responsebody = response.getBody().asPrettyString();

		//print
		System.out.println(responsebody);



	}
}
