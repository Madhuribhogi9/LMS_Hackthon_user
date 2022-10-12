package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class DeleteIcon
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public DeleteIcon() throws IOException
    {
    }

    @Then("User should see the delete icon at the top left corner of the user table")
    public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
        userPage.deletebutton();
    }
    @When("no rows is checked")
    public void no_rows_is_checked() {
        userPage.chckboxunselectingtest();
    }
    @Then("Delete icon at the top left corner of the user table disabled")
    public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
        userPage.deletebutton();
    }
    @When("User checks the rows in user table")
    public void user_checks_the_rows_in_user_table() {
        userPage.checkboxclicking();
    }
    @Then("Delete icon at the top left corner of the user table enabled")
    public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
        userPage.deletebtnenabled();
    }
    @Given("User checks the rows in the user table")
    public void user_checks_the_rows_in_the_user_table() {
    }
    @When("User clicks the delete icon at the top left corner of user table")
    public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
        userPage.deletebtnclicking();
    }
    @Then("Confirm dialog box should be displayed with Text of Are you sure you want to delete the selected Users?,button with text No the button with text yes")
    public void confirm_dialog_box_should_be_displayed_with_text_of_are_you_sure_you_want_to_delete_the_selected_users_button_with_text_no_the_button_with_text_yes() {
        Assert.assertEquals(userPage.deletedialogbox(),"Are you sure you want to delete the selected Users?");
    }
    @Given("User is in confirm dialog box after clicking delete icon")
    public void user_is_in_confirm_dialog_box_after_clicking_delete_icon() {
        userPage.deletedialogboxdisplay();
    }
    @When("User clicks button with text No")
    public void user_clicks_button_with_text_No(){
        userPage.closebtn();
    }
    @Then("Selected rows should not be deleted and dialog box should be closed")
    public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
        userPage.name();
    }
    @When("User clicks button with text Yes")
    public void user_clicks_button_with_text_yes()
    {
        System.out.println("User click on yes button");
    }

    @Then("Selected rows should be deleted and popup should be shown with success message Users deleted")
    public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message_users_deleted()
    {
        System.out.println("User should see a successful message");
    }
}
