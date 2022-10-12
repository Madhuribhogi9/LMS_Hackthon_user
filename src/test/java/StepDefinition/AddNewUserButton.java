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

public class AddNewUserButton
{

    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);
    private HomePage homePage =new HomePage(driver);

    public AddNewUserButton() throws IOException
    {
    }
    @When("User is on the Manage user page after clicking User Tab")
    public void user_is_on_the_manage_user_page_after_clicking_user_tab()
    {
        homePage.Userbuttonclick();
    }
    @Then("User should see the button with text Add New User")
    public void user_should_see_the_button_with_text_add_new_user()
    {
        Assert.assertEquals(userPage.addnewuser(),"Add New User");
    }
    @When("User clicks Add New User button")
    public void user_clicks_add_new_user_button()
    {
        userPage.addingnewuserbutton();
    }
    @Then("User should see the User details dialog box")
    public void user_should_see_the_user_details_dialog_box()
    {
        userPage.userdetailstitle();
    }




}
