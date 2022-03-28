package apiTestsUsingBdd;
	import org.testng.annotations.*;
	import static io.restassured.RestAssured.*;

public class DeleteUser {
	
    @Test
	public void delete_User_Record(){
			given()
			.when()
			.delete("https://reqres.in/api/users?page=3")
			.then()
			.statusCode(204) ;
			     
		
	}
		

			
	}

