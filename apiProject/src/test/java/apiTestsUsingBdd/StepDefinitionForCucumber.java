package apiTestsUsingBdd;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForCucumber {
	/*@Given("I have list of users")
	public void i_have_list_of_users() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("Use get request for user detals")
	public void use_get_request_for_user_detals()throws Exception {
	    
		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200) ;
	    
	}
	
	/*@Then("Verify status code and response body for all users")
	public void verify_status_code_and_response_body_for_all_users() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Use POST request for new user")
	public void use_post_request_for_new_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify status code and response body if new user created")
	public void verify_status_code_and_response_body_if_new_user_created() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Provide request payload and give POST request body for new user")
	public void provide_request_payload_and_give_post_request_body_for_new_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify status codenand response body if new user created")
	public void verify_status_codenand_response_body_if_new_user_created() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Provide user id and use DELETE code")
	public void provide_user_id_and_use_delete_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify record with given ID is deleted")
	public void verify_record_with_given_id_is_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Use get request for given user details")
	public void use_get_request_for_given_user_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify response SINGLE USER NOT FOUND")
	public void verify_response_single_user_not_found() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("tried to register with incomeple detals")
	public void tried_to_register_with_incomeple_detals() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify response status code")
	public void verify_response_status_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

}
