package StepDefinition;

import Pages.UserPage;
import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TableHeader
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public TableHeader() throws IOException
    {
    }

    @Then("User should see the table header as Empty checkbox-icon")
    public void user_should_see_the_table_header_as_empty_checkbox_icon() {
        userPage.checkbox();
    }
    @Then("ID with sort icon")
    public void id_with_sort_icon() {
        userPage.idsort();
    }
    @Then("Name with Sort icon")
    public void name_with_sort_icon() {
        userPage.name();
    }
    @Then("Email Address with sort icon")
    public void email_address_with_sort_icon() {
        userPage.emailaddress();
    }
    @Then("Contact Number with sort icon")
    public void contact_number_with_sort_icon() {
            userPage.contactnumber();
    }
    @Then("Batch with sort icon")
    public void batch_with_sort_icon() {
          userPage.batch();
    }
    @Then("Skill with Sort icon")
    public void skill_with_sort_icon() {
        userPage.skill();
    }
    @Then("Edit and Delete as column names")
    public void edit_delete_as_column_names() {
        userPage.EditAndDelete();
    }
    @Given("User table is displayed in manage user page")
    public void user_table_is_displayed_in_manage_user_page() {
        userPage.Manageuserchecking();
    }
    @When("User clicks sort icon in table header")
    public void user_clicks_sort_icon_in_table_header() {
        userPage.idsort();
    }
    @Then("Table rows should be sorted")
    public void table_rows_should_be_sorted() {
        userPage.idsortorderchecking();
    }
    @When("User checks empty checkbox in header")
    public void user_checks_empty_checkbox_in_header() {
        userPage.checkboxclicking();

    }
    @Then("Check box in all the rows of user table should be checked")
    public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
        userPage.chckboxselectingtest();
    }
    @When("User unchecks checkbox in header")
    public void user_unchecks_checkbox_in_header() {
        userPage.checkboxclicking();
    }
    @Then("Check box in all the rows of user table should be unchecked")
    public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
        userPage.chckboxunselectingtest();
    }
}
