//when we need to provide crediantial to third party we use Auto2.0 Authorization

//https://api-m.sandbox.paypal.com/v1/oauth2/token
//basic auth me hume user id or password dena huta he
//UserID: Client: client ID
//password: secret

package Session11;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Oauth20 
{
@Test
public void Getaccesstoken()
{
	RequestSpecification Reqspec = RestAssured.given();
	
	Reqspec.baseUri("https://api-m.sandbox.paypal.com");
	Reqspec.basePath("/v1/oauth2/token");
	//basic authorization
	Reqspec.auth().preemptive().basic(null, null);
	
	
}
}
