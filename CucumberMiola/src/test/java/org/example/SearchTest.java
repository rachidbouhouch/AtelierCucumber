package org.example;

import io.cucumber.java.en.*;

public class SearchTest {
    @Given("Enter search term {string}")
    public void enterSearchTermCucumber(String name) {
        System.out.println("test 1");
    }

    @When("Do search")
    public void doSearch() {
        System.out.println("test 2");
    }

    @Then("Single result is shown for {string}")
    public void singleResultIsShownForCucumber(String name) {
        System.out.println("test 3");
    }

}
