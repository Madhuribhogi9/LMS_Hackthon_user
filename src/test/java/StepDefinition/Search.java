package StepDefinition;

import Pages.UserPage;
import Utilities.FileManager;
import factory.WebDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Search
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public Search() throws IOException
    {
    }

    @Then("User should see the Search input field after the delete icon")
    public void user_should_see_the_search_input_field_after_the_delete_icon()
    {
        userPage.Searchbtn();
    }
    @Then("User should see the search input field with search icon and text as Search…")
    public void user_should_see_the_search_input_field_with_search_icon_and_text_as_search()
    {
        userPage.Searchbtn();
    }
    @When("User types Name to search")
    public void user_types_name_to_search() throws IOException
    {
        userPage.Searchtext().sendKeys(FileManager.getPropertyValue("UserNameForSearch"));
    }
    @Then("Rows with the name should be displayed")
    public void rows_with_the_name_should_be_displayed()
    {
        userPage.checkingnames();
    }
    @When("User types random text in search field which has no matching entry")
    public void user_types_random_text_in_search_field_which_has_no_matching_entry() throws IOException
    {
        userPage.Searchtext().sendKeys(FileManager.getPropertyValue("RandomUserNameForSearch"));
    }
    @Then("No rows is displayed")
    public void no_rows_is_displayed() {

        if(!(userPage.checkingrandomnames()))
        {
            System.out.println("No rows are displayed");
        }

    }

}
