package apiTestsUsingBdd;

import org.testng.annotations.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;


public class PutRequest {

	public static HashMap map=new HashMap();
	@BeforeClass
	public void postdata()
	{
		map.put("name","morpheus");
		map.put("job","zion resident");
		RestAssured.baseURI="https://reqres.in/api/users/2";
		//RestAssured.basePath="/2";
	}
	@Test
    public void updateUser() 
	{
		given()
		.contentType("application/json")
		.body(map)
		.when()
		   .put()
		 .then()
		   .statusCode(200);
		    
	
}
	

		
}



