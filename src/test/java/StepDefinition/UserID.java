package StepDefinition;

import Pages.HomePage;
import Pages.UserPage;
import factory.WebDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class UserID
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public UserID() throws IOException
    {
    }

    @When("User clicks ID in any row")
    public void user_clicks_id_in_any_row() {
        userPage.userid();
    }
    @Then("User details dialog box displayed with user information")
    public void user_details_dialog_box_displayed_with_user_information() {
        userPage.userdetailsdisplay();
    }
}
