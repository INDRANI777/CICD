package BDD_STEPS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {
	
	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}



}
