package Session13;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;
//URL: https://reqres.in/api/users/2

public class Create_User 
{
	@Test
	public void reterivequery()
	{
		//Create Payload
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Ruchika");
		jsonData.put("job", "QA");


		RequestSpecification reqspec = RestAssured.given();
		reqspec.baseUri("https://reqres.in");
		reqspec.basePath("/api/users/2");
		reqspec.contentType(ContentType.JSON).body(jsonData.toJSONString());
		
		//today topic to reterive query of requestspecification
		//for this we have seperate class specificationquerier
		
		QueryableRequestSpecification query=  SpecificationQuerier.query(reqspec);
		
		String reteriveBaserURI = query.getBaseUri();
		String reteriveBaserpath = query.getBasePath();
		String reterivebody = query.getBody();
		
		System.out.println("Thos is Base URI: " +reteriveBaserURI );
		System.out.println("Thos is Base PATH: " +reteriveBaserpath );
		System.out.println("Thos is Base body: " +reterivebody );
		
		//reterive header
		Headers allheaders = query.getHeaders();
		
		for(Header h:allheaders)
		{
			System.out.println("Header Name: "+ h.getName()+ "/ Headervalue: " + h.getValue() );
		}
		
		


	}
}
