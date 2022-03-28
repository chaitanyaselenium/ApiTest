package apiTestsUsingBdd;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;

public class UserNotFound {
	@Test

	public void user_Is_Not_Avaialable(){
		given()
		.when()
		.get("https://reqres.in/api/users/23")
		.then()
		.statusCode(404) ;
		
		
		
	}


}
