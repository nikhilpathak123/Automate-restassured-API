package Session04;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Validatestatuscode_BDDstyle 
{
	@Test
	public void Getstatuscode_BDDstyle()
	
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users/2")
		
		
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();
		
	}

}
