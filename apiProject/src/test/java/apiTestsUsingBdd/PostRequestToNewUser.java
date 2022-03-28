
package apiTestsUsingBdd;
import org.testng.annotations.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;



public class PostRequestToNewUser {

	public static HashMap map=new HashMap();
	@BeforeClass
	public void postdata()
	{
		map.put("name",RestUtils.getName());
		map.put("job",RestUtils.getJob());
		RestAssured.baseURI="https://reqres.in/api/users";
	
	}
	@Test
    public void postNewUser() 
	{
		given()
		.contentType("application/json")
		.body(map)
		.when()
		   .post()
		 .then()
		   .statusCode(201);
		      
	
}
	

		
}
