package Session2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First_getrequest 
{
	//https://reqres.in/api/users/2
	@Test
	void testcase1()
	{
		Response resp = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(resp.asPrettyString());
	}

}
