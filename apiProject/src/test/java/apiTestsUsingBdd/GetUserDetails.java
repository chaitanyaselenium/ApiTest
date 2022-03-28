package apiTestsUsingBdd;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

public class GetUserDetails {
	
	@Test

	public void get_list_of_users_avaialable(){
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200) ;
		
		
		
	}

	
	
	
}
