package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    @FindBy(id = "username")
    private WebElement usernamebutton;

    @FindBy(id = "password")
    private WebElement passwordbtn;

    @FindBy(xpath = "//span[text() = 'Login']")
    private WebElement loginbtn;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void loginbtn()
    {
        loginbtn.click();
    }

    public WebElement getPasswordbtn()
    {
        return passwordbtn;
    }

    public WebElement getUsernamebutton()
    {
        return usernamebutton;
    }
}
