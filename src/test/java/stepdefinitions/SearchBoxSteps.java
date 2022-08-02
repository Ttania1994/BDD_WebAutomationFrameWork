package stepdefinitions;


import configuration.common.WebTestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import java.util.List;

import static configuration.common.GlobalReUsableMethods.verifyText;

public class SearchBoxSteps extends WebTestBase {

    HomePage homePage = new HomePage();
    @Given("user is landed on target homepage")
    public void user_is_landed_on_target_homepage() {
        System.out.println("Target home page should land");
    }

    @Given("user enter valid product name")
    public void user_enter_valid_product_name() {
        homePage.enterProductName("Mask");
    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        homePage.clickOnSearchButton();
    }

    @Then("user should see the valid product appears")
    public void user_should_see_the_valid_product_appears() {
        verifyText(homePage.verifySearchedProduct,"Popular Filters","Product doesn't show properly");
    }

}
