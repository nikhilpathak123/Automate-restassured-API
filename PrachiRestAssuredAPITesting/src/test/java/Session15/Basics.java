/*JSON stand for javascript object notification it is a data exchange format mostly used for client and server data exchange
 * it is light in weight and data is in key and value pair 
 * key will be string and value can be string, int, boolean, array, object, null
 * 
 */


package Session15;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Basics {
	
	@Test
	public void restfull()
	{
	//create data in mao
		/*{
    "username" : "admin",
    "password" : "password123"
}'
		 * */
		Map<String, String> authtoken = new HashMap<String, String>();
		//now put the value which is alos in string
		authtoken.put("username", "admin");
		authtoken.put("password", "password123");
		
		Response response = RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/auth")
		.contentType(ContentType.JSON)
		.body(authtoken)
		.post();
		
		System.out.println(response.asString());
		System.out.println("This is status code: " + response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 200);
		
		 
	}

}
