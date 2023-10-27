package org.example.test.step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class MainSteps {

    @Given("setup the entries in database")
    public void setup_the_entries_in_database() {
        System.out.println("********************");
        System.out.println("Setup the entries in the DB");
        System.out.println("Home page is displayed");
    }

    @When("launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        System.out.println("Launch the browser from config variables");
    }

    @When("hit the home page url of banking site")
    public void hit_the_home_page_url_of_banking_site() {
        System.out.println("hit the home page url of banking site");
    }

    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User landed on NetBanking page");
    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String user, String pass) {
        System.out.println(user + " and password is " + pass);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Home page is displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        System.out.println("User landed on Practice landing page");
        Assert.fail();
    }

    @When("User login into application")
    public void user_login_into_application(DataTable dataTable) {
        List<List<String>> table = dataTable.asLists();
        for(List<String> row : table) {
            System.out.println(row.get(0));
        }
    }
}
