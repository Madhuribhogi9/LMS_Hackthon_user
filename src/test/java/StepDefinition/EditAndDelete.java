package StepDefinition;

import Pages.HomePage;
import Pages.UserPage;
import factory.WebDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class EditAndDelete
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public EditAndDelete() throws IOException
    {
    }

    @Then("User should see the buttons with edit and delete icon in each row of Edit and Delete column")
    public void user_should_see_the_buttons_with_edit_and_delete_icon_in_each_row_of_edit_and_delete_column()
    {
        userPage.EditAndDeletebtnChecking();
    }
    @When("User clicks delete button")
    public void user_clicks_delete_button()
    {
        userPage.editanddeletebtnclicking();
    }
    @Then("Confirm dialog box should be displayed with Text as Are you sure you want to delete \\(selected user name)? button with text No the button with text yes and close icon")
    public void confirm_dialog_box_should_be_displayed_with_text_as_are_you_sure_you_want_to_delete_selected_user_name_button_with_text_no_the_button_with_text_yes_and_close_icon()
    {
        userPage.confirmdialogueboxwithname();
        userPage.closebtn();
    }
    @When("User clicks Edit button")
    public void user_clicks_edit_button()
    {
        userPage.editbtnclicking();
    }
    @Then("User Details dialog box should be displayed for editing")
    public void user_details_dialog_box_should_be_displayed_for_editing()
    {
        userPage.userdetailschecking();
    }





    }
