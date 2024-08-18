//hum response ko capture ker rahe he
package Session03;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_Getreq 
{
	//https://reqres.in/api/users?page=2
		@Test
		void testcase1()
		{
			Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
			System.out.println(resp.asPrettyString());
			System.out.println("Response Code" + resp.getStatusCode());
			System.out.println("Response Body" + resp.getBody().asPrettyString());
			System.out.println("Response Time" + resp.getTime());
			System.out.println("Response Header" + resp.getHeader("Date"));
			
			//Validation
			int expectedcode = 200;
			int actualcode = resp.getStatusCode();
			
			Assert.assertEquals(expectedcode, actualcode);
		}
		// BDD style given, then & when
		@Test
		public void test02()
		{
		RestAssured.baseURI = "https://reqres.in/api/users"	;
		RestAssured.given().queryParam("page", "2").when().get().then().statusCode(200);
		}
		


}
