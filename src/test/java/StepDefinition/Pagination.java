package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Utilities.FileManager;
import factory.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Pagination
{
    private WebDriver driver = WebDriverFactory.getWebDriver();
    private UserPage userPage = new UserPage(driver);

    public Pagination() throws IOException
    {
    }

    @Then("User should see the pagination controls below data table")
    public void user_should_see_the_pagination_controls_below_data_table()
    {
        userPage.Paginationcontrols();
    }
    @Given("User is on Manage user page")
    public void user_is_on_manage_user_page()
    {
        System.out.println("user is already in manage user page");
    }
    @When("Manage user table has less than or equal to five rows")
    public void manage_user_table_has_less_than_or_equal_to_five_rows()
    {
        userPage.Rowscount();
    }
    @Then("Pagination control should be disabled")
    public void pagination_control_should_be_disabled()
    {
        userPage.Paginationbuttondisabledchecking();
    }
    @When("Manage user table has more than five rows")
    public void manage_user_table_has_more_than_five_rows()
    {
        if(userPage.Rowscount()==false)
        {
            System.out.println("Manage user table has more than five rows");
        }
    }
    @Then("Pagination control should be enabled")
    public void pagination_control_should_be_enabled()
    {
        userPage.Paginationbuttondisabledchecking();
    }
    @When("User clicks next link of pagination")
    public void user_clicks_next_link_of_pagination()
    {
        if (userPage.Nextbutton() == false)
        {
            System.out.println("Next link button is disabled");
        }
    }
    @Then("Next page should be displayed")
    public void next_page_should_be_displayed()
    {
        if (userPage.Nextbutton() == false)
        {
            System.out.println("Next page should not be displayed");
        }
    }
    @Given("last page of User records are displayed")
    public void last_page_of_user_records_are_displayed()
    {
        System.out.println("User is on last page only");
    }
    @Then("Next link of pagination should be disabled")
    public void next_link_of_pagination_should_be_disabled()
    {
        if (userPage.Nextbutton() == false)
        {
            System.out.println("Next Link of pagination is disabled");
        }
        }

    @When("User clicks previous link of pagination")
    public void user_clicks_previous_link_of_pagination()
    {
        if (userPage.Previousbutton() == false)
        {
            System.out.println("Previous Link of pagination is disabled");
        }
    }
    @Then("previous page should be displayed")
    public void previous_page_should_be_displayed()
    {
        if (userPage.Previousbutton() == false)
        {
            System.out.println("Previous Link of pagination is disabled");
        }
    }
    @Given("First page of user table is displayed")
    public void first_page_of_user_table_is_displayed()
    {
        System.out.println("User is on first page only");
    }
    @Then("Previous link of pagination should be disabled")
    public void previous_link_of_pagination_should_be_disabled()
    {
        if (userPage.Previousbutton() == false)
        {
            System.out.println("Previous Link of pagination is disabled");
        }
    }
    @When("User clicks << icon in pagination")
    public void user_clicks_icon_in_pagination()
    {
        if (userPage.Previousbutton() == false)
        {
            System.out.println("Previous Link of pagination is disabled");
        }
    }
    @Then("User should see the First page of the table")
    public void user_should_see_the_first_page_of_the_table()
    {
        System.out.println("User is on first page only");
    }
    @When("User clicks >> icon in pagination")
    public void user_clicks_next_icon_in_pagination()
    {
        if (userPage.Nextbutton() == false)
        {
            System.out.println("Next Link of pagination is disabled");
        }
    }
    @Then("User should see the last page of the table")
    public void user_should_see_the_last_page_of_the_table()
    {
        System.out.println("user is on last page only");
    }










}
