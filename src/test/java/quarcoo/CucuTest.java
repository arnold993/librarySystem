package quarcoo;

import static org.junit.Assert.assertEquals;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

public class CucuTest {
    static String IsItFriday(String today) {
        return "Friday".equals(today) ? "yes":"no";
    }
}

class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("Today is Monday")
    public void today_is_Monday() {
        today = "Monday";
    }

    @Given("Today is Friday")
    public void today_is_Friday() {
        today = "Friday";
    }

    @When("I ask whether it's Friday")
    public void i_ask_whether_it_s_Friday() {
        actualAnswer = CucuTest.IsItFriday(today);
    }

    @Then("I should be told ")
    public void i_should_be_told(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }
}