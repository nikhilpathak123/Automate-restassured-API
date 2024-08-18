//watch from 17:29 Session 14
package Session14;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validate_XML_Resposne 
{
	@Test
	public void XMLResponse()
	{
		//pass the XML data
		String JSONdata = "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		
		
		//Create Requiest Specification
		//URL: https://petstore.swagger.io/v2/pet
		RequestSpecification reqspec = RestAssured.given();
		reqspec.baseUri("https://petstore.swagger.io");
		reqspec.basePath("/v2/pet");
		
		//Pass Header
		reqspec.headers("accept", reqspec, "application/json").headers("Content-Type", reqspec, "application/json");
		reqspec.body("XMLResponse");
		
		//perform post request
		
		Response response = reqspec.post();
		
		response.asPrettyString();
		
		
		
		
		
		
	}

}
