Feature: Verifying user records

@test
Scenario: Verify are we able to retrieve user details
Given I have list of users
When  Use get request for user detals
Then verify status code and response body for all users

@test
Scenario: Verify are we able to add new user details
Given I have list of users         
When Use POST request for new user
Then Verify status code and response body if new user created

@test
Scenario: Verify are we able to update existing user details
Given I have list of users 
When Use PUT request to update existing user
Then Verify status code and response body if new details updated


@test
Scenario: Verify are we able to delete existing user details
Given I have list of users
When Provide user id and use delete request with existing user 
Then Verify record with given ID is deleted


@test
Scenario: negitive scenario with non existing userid and incomplete detals
Given I have list of users
When  Use get request with non existing user id
And tried to register with incomplete user details
Then  Verify response codes 

