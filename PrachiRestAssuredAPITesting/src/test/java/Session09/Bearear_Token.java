// bearerar authonticatin is alos called token authontication is a HTTP authontication that invoive security key callled bearear token
package Session09;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Bearear_Token {

	@Test
	public void Beareartoken()
	{
		//url: https://gorest.co.in/public/v2/users
		//create requestspecification
		RequestSpecification requestSepc = RestAssured.given();

		//get baseurl
		requestSepc.baseUri("https://gorest.co.in");
		requestSepc.basePath("/public/v2/users");

		//import JSONObject and create payload
		JSONObject payload = new JSONObject();
		payload.put("Name", "Nikhil Kumar jdksjsdc");
		payload.put("Gender", "Male");
		payload.put("Email", "nikhil.qa");
		payload.put("Status", "Active");

		String Authtoken = "58120a033fe9574904bbdf3d1543f48a26a9fb989078c780e6f0b8292d39d4aa";
		//this token will be send as a header so we have send header in key value pair
		//then contentent typw humare json me he then. body jo hume ne payload me store ki he jo json string me he.

		requestSepc.header("Authorization", Authtoken)
		.contentType(ContentType.JSON)
		.body(payload.toJSONString());
		
		//send post request
		Response response = requestSepc.post();
		
		//print resposne
		System.out.println("This is response" + response.statusCode());
		
		System.out.println("This is response" + response.asPrettyString());
		







	}
}
