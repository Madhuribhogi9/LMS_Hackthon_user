package StepDefinition;

import Pages.HomePage;
import Pages.UserPage;
import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.IOException;

public class UserDetails
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public UserDetails() throws IOException
    {
    }

    @When("User clicks A Add new user button")
    public void user_clicks_a_add_new_user_button() {
        userPage.addingnewuserbutton();
    }
    @Then("User should see User details window with heading User Details")
    public void user_should_see_user_details_window_with_heading_user_details() {
        userPage.userdetailsdisplay();
    }
    @When("User clicks A Add new users button")
    public void user_clicks_a_add_new_users_button() {
        System.out.println("Window is already displayed");
    }
    @Then("User should see a button with text Cancel in user details window")
    public void user_should_see_a_button_with_text_cancel_in_user_details_window() {
        userPage.Cencelbtn();
    }
    @Given("User is on User details window")
    public void user_is_on_user_details_window() {
        System.out.println("Window is already displayed");
    }
    @When("User clicks A cancel button")
    public void user_clicks_a_cancel_button() {
        userPage.Cancelbtnclick();
    }
    @Then("User details window should be closed")
    public void user_details_window_should_be_closed() {
        userPage.userdetailsclosed();
    }
    @Then("User should see a button with text Submit in user details window")
    public void user_should_see_a_button_with_text_submit_in_user_details_window() {
        userPage.submitbtn();
    }
    @When("User clicks Add new user button")
    public void user_clicks_add_new_user_button() {
        System.out.println("Window is already displayed");
    }
    @Then("User should see the placeholders with all details")
    public void user_should_see_the_placeholders_with_all_details() {
        Assert.assertEquals(userPage.Firstname(), "First name");
    }
    @Then("User should see the input fields with all details")
    public void user_should_see_the_input_fields_with_all_details()
    {
        userPage.firstname();
    }
    @When("User click A Add new user button")
    public void user_click_a_add_new_user_button() {
        System.out.println("Window is already displayed");
    }
    @Then("User should see the button with some text")
    public void user_should_see_the_button_with_text_as_add_c_o_apt_suite_unit() {
        userPage.addressbtn();
    }
    @When("User clicks the button which contains address text")
    public void user_clicks_the_button() {
        userPage.addressbtnclicking();
    }
    @Then("User should see the input field with Label {string}")
    public void user_should_see_the_input_field_with_label(String string) {
        userPage.secondaddressbtn();
    }
    @When("User clicks postal code input field")
    public void user_clicks_postal_code_input_field() {
        userPage.postalcode();
    }
    @Then("User should see the input Number arrows in the postal code input field")
    public void user_should_see_the_input_number_arrows_in_the_postal_code_input_field() {
        userPage.postalcodedisplay();

    }


}
