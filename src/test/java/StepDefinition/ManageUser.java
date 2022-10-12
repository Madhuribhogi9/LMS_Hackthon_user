package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Utilities.FileManager;
import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ManageUser
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);
    private LoginPage loginpage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);
    private static Logger logger = LogManager.getLogger(ManageUser.class);

    public ManageUser() throws IOException
    {
    }

    @Given("User is on any page after Login")
    public void user_is_on_any_page_after_login() throws IOException
    {
        driver = WebDriverFactory.getWebDriver();
        driver.get(FileManager.getPropertyValue("URL"));
        loginpage.getUsernamebutton().sendKeys(FileManager.getPropertyValue("username"));
        logger.info("user enters the username");
        loginpage.getPasswordbtn().sendKeys(FileManager.getPropertyValue("password"));
        logger.info("user enters the password");
        loginpage.loginbtn();
    }
    @When("User clicks the Tab user")
    public void user_clicks_the_tab()
    {
        logger.info("user clicks on userbutton");
        homePage.Userbuttonclick();
    }
    @Then("User should see the Manage user page")
    public void user_should_see_the_manage_user_page()
    {
        logger.info("user should see the manage user page");
        userPage.Manageuserchecking();
    }
}
