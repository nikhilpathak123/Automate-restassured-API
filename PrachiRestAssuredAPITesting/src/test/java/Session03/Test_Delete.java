//post request ko delete kerne  he

package Session03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test_Delete 
{
	@Test
	public void test05()
	{
		RestAssured.baseURI = "https://reqres.in/api/users/128";
		RestAssured.given().
		when().delete().
		then().
		log().all().statusCode(204);
	}
	

}
