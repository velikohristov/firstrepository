package TestNG;

public class Lection19_exercise4 {
	
    @Given("the user is on the registration page")
    public void givenTheUserIsOnTheRegistrationPage() {
        // Implement logic to navigate to the registration page
    }

    @When("the user enters valid registration details with username {string}, email {string}, and password {string}")
    public void whenTheUserEntersValidRegistrationDetails(String username, String email, String password) {
        // Implement logic to fill in registration form with provided details
    }

    @And("the user submits the registration form")
    public void andTheUserSubmitsTheRegistrationForm() {
        // Implement logic to submit the registration form
    }

    @Then("the user is successfully registered")
    public void thenTheUserIsSuccessfullyRegistered() {
        // Implement logic to verify that registration was successful
    	
    }
}