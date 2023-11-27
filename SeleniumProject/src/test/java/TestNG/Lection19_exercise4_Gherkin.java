package TestNG;

public class Lection19_exercise4_Gherkin {

	Feature: Online Forum Registration Process

	Scenario Outline: User registration on the online forum
    Given the user is on the registration page
    When the user enters valid registration details with username "Veliko_Hristov", email "valeto_il@abv.bg", and password "Pass_1234"
    And the user submits the registration form
    Then the user is successfully registered
      
	}