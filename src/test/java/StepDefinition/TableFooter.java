package StepDefinition;

import Pages.UserPage;
import factory.WebDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class TableFooter
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage= new UserPage(driver);

    public TableFooter() throws IOException
    {
    }

    @When("User can see Manage user page")
    public void user_can_see_manage_user_page()
    {
        System.out.println("User can see manage user page");
    }
    @Then("User should see the table footer as In total there are five users")
    public void user_should_see_the_table_footer_as_in_total_there_are_five_users()
    {
        Assert.assertEquals(userPage.tablefooter(),"In total there are 4 users.");
    }
}
