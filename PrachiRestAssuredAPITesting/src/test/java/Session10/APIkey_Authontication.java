//Api kay is a unique string of character that used to authonticate the user to access the API.
// this key is generate from server and provided to client
//the client send the key to server along with each request to authonticate the user identity and provice authorization to acess the resources

package Session10;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIkey_Authontication 

{
	//create test mehod and give testng test annotation
	@Test
	public void Getweatherupdate()
	{
	RequestSpecification Requestspec = RestAssured.given();
	
	// pass query parameter to pass key and value
	Requestspec.queryParam("q", "Delhi").queryParam("API", "");
	
	//pass the uri
	Requestspec.baseUri("");
	Requestspec.basePath("");
	
	//Pass the get request
	Response response = RestAssured.get();
	
	}

}
