package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    @FindBy(xpath = "//span[text()= 'User']")
    private WebElement userbutton;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void Userbuttonclick()
    {
        userbutton.click();
    }
}
