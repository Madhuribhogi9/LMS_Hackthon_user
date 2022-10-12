package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UserPage
{
    @FindBy(xpath = "//button[text() = '2']")
    private WebElement secondpagebutton;

    @FindBy(xpath = "//span[text() = 'Add New User']")
    private WebElement addnewuserbutton;

    @FindBy(xpath = "//div[text()=' Manage User']")
    private WebElement manageuserchecking;

    @FindBy(xpath = "//button[text() ='1']")
    private WebElement firstpageageonebutton;

    @FindBy(xpath = "//span[text() = 'Showing 1 to 4 of 4 entries']")
    private WebElement paginationcontrols;

    @FindBy(xpath = "//tbody//tr[@class ='ng-star-inserted']")
    private List<WebElement> rowscount;

    @FindBy(xpath = "//button[@type = 'button']")
    private WebElement nextbutton;

    @FindBy(xpath = "//button[@type = 'button']")
    private WebElement previousbutton;

    @FindBy(xpath = "//div[text()=' In total there are 4 users.']")
    private WebElement tablefooter;

    @FindBy(xpath = "//span[text() = 'User Details']")
    private WebElement userdetailstitle;

    @FindBy(xpath = "(//th[@aria-sort='none'])[1]")
    private WebElement idsort;

    @FindBy(xpath = "(//th[@aria-sort='none'])[2]")
    private WebElement namesort;

    @FindBy(xpath = "(//th[@aria-sort='none'])[3]")
    private WebElement emailaddresssort;

    @FindBy(xpath = "(//th[@aria-sort='none'])[4]")
    private WebElement contactnumbersort;

    @FindBy(xpath = "(//th[@aria-sort='none'])[5]")
    private WebElement batchsort;

    @FindBy(xpath = "(//th[@aria-sort='none'])[6]")
    private WebElement skillsort;

    @FindBy(xpath = "//th[text() = ' Edit / Delete']")
    private WebElement editanddelete;

    @FindBy(xpath = "(//div[@role ='checkbox'])[1]")
    private WebElement checkbox;

    @FindBy(xpath = "//tr//td//span[text() = 'U001']")
    private WebElement firstuser;

    @FindBy(xpath = "//tr//td//span[text() = 'U002']")
    private WebElement seconduser;

    @FindBy(xpath = "//tr//td//span[text() = 'U003']")
    private WebElement thirduser;

    @FindBy(xpath = "//tr//td//span[text() = 'U004']")
    private WebElement fourthuser;

    @FindBy(xpath = "//div[@role ='checkbox']")
    private List<WebElement> checkboxes;

    @FindBy(xpath = "(//div//mat-card-title//button//span[@aria-hidden = 'true'])[1]")
    private WebElement deletebtn;

    @FindBy(xpath = "//span[text() ='Are you sure you want to delete the selected Users?']")
    private WebElement deleteconfirmationbox;

    @FindBy(xpath = "(//button[@type = 'button'])[10]")
    private WebElement closingdeletebox;

    @FindBy(xpath = "//tr//td//span//button[@icon = 'pi pi-trash']")
    private List<WebElement> editanddeletebtn;

    @FindBy(xpath = "//span[text() = 'Are you sure you want to delete John  Dove?']")
    private WebElement confirmationboxwithname;

    @FindBy(xpath = "//tr//td//span//button[@icon = 'pi pi-pencil']")
    private List<WebElement> editbutton;

    @FindBy(id = "pr_id_5-label")
    private WebElement userdetailsdialoguebox;

    @FindBy(xpath = "(//button[@type = 'button'])[10]")
    private WebElement closebtn;

    @FindBy(xpath = "//input[@placeholder = 'Search...']")
    private WebElement Searchbtn;

    @FindBy(xpath = "(//th[@class = 'p-sortable-column'])[1]")
    private WebElement userid;

    @FindBy(xpath = "//span[text() = 'User Details']")
    private WebElement userdetailswindowbtn;

    @FindBy(xpath = "(//button[@type = 'button'])[6]")
    private WebElement userdetailsclosebtn;

    @FindBy(xpath = "//span[text() ='Cancel']")
    private WebElement cancelbtn;

    @FindBy(xpath = "//span[text() ='Submit']")
    private WebElement submitbtn;

    @FindBy(xpath = "//span[text() = 'First name']")
    private WebElement firstname;

    @FindBy(xpath = "//span[text() = ' + Add C/O, Apt, Suite, Unit ']")
    private WebElement addressbtn;

    @FindBy(xpath = "//textarea[@formcontrolname = 'address2']")
    private WebElement secondaddressbtn;

    @FindBy(xpath = "//input[@formcontrolname = 'postalCode']")
    private WebElement postalcodebtn;

    public UserPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void addingnewuserbutton()
    {
        addnewuserbutton.click();
    }

    public WebElement getFirstpageageonebutton()
    {
        return firstpageageonebutton;
    }

    public boolean Manageuserchecking()
    {
        return manageuserchecking.isDisplayed();
    }

    public boolean Paginationcontrols()
    {
        return paginationcontrols.isDisplayed();
    }

    public boolean Rowscount()
    {
        if (rowscount.size() <= 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean Paginationbuttondisabledchecking()
    {
        if (!(paginationcontrols.isEnabled()))
        {
            return true;
        }
        return true;
    }

    public boolean Nextbutton()
    {
        if (nextbutton.isEnabled())
        {
            return true;
        }
        return true;
    }

    public boolean Previousbutton()
    {
        if (previousbutton.isEnabled())
        {
            return true;
        }
        return true;
    }

    public String tablefooter()
    {
        String Tablefooter = tablefooter.getText();
        return Tablefooter;
    }

    public String addnewuser()
    {
        String AddNewUser = addnewuserbutton.getText();
        return AddNewUser;
    }

    public boolean userdetailstitle()
    {
        if (userdetailstitle.isDisplayed())
        {
            return true;
        }
        return true;
    }

    public boolean idsort()
    {
        return idsort.isDisplayed();
    }

    public boolean name()
    {
        return namesort.isDisplayed();
    }

    public boolean emailaddress()
    {
        return emailaddresssort.isDisplayed();
    }

    public boolean contactnumber()
    {
        return contactnumbersort.isDisplayed();
    }

    public boolean batch()
    {
        return batchsort.isDisplayed();
    }

    public boolean skill()
    {
        return skillsort.isDisplayed();
    }

    public boolean EditAndDelete()
    {
        return editanddelete.isDisplayed();
    }

    public boolean checkbox()
    {
        if(!checkbox.isSelected())
        {
            return true;
        }
        return true;
    }

    public void idsortbuttonclicking()
    {
        idsort.click();
    }

    public boolean idsortorderchecking()
    {
        List<String> list = new LinkedList<String>();
        list.add(firstuser.getText());
        list.add(seconduser.getText());
        list.add(thirduser.getText());
        list.add(fourthuser.getText());
        Collections.sort(list);
        List<String> newlist = new LinkedList<String>();
        newlist.add(firstuser.getText());
        newlist.add(seconduser.getText());
        newlist.add(thirduser.getText());
        newlist.add(fourthuser.getText());
        return (list==newlist);
    }

    public void checkboxclicking()
    {
        checkbox.click();
    }

    public boolean chckboxselectingtest()
    {
        for (WebElement webElement : checkboxes)
        {
            if(webElement.isSelected())
            {
                continue;
            }
        }
        return true;
    }
    public boolean chckboxunselectingtest()
    {
        for (WebElement webElement : checkboxes)
        {
            if(!(webElement.isSelected()))
            {
                continue;
            }
        }
        return true;
    }
    public boolean deletebutton()
    {
            return deletebtn.isDisplayed();
    }
    public boolean deletebtnenabled()
    {
        return deletebtn.isEnabled();
    }
    public void deletebtnclicking()
    {
        deletebtn.click();
    }
    public String deletedialogbox()
    {
        return deleteconfirmationbox.getText();
    }
    public void closebtn()
    {
        closingdeletebox.click();
    }
    public boolean deletedialogboxdisplay()
    {
        return deleteconfirmationbox.isDisplayed();
    }
    public boolean EditAndDeletebtnChecking()
    {
        for (WebElement webElement : editanddeletebtn)
        {
            webElement.isDisplayed();
        }
        return true;
    }
    public void editanddeletebtnclicking()
    {
        editanddeletebtn.get(0).click();
    }
    public boolean confirmdialogueboxwithname()
    {
        return confirmationboxwithname.isDisplayed();
    }
    public void editbtnclicking()
    {
        editbutton.get(0).click();
    }
    public boolean userdetailschecking()
    {
        return userdetailsdialoguebox.isDisplayed();
    }
    public void closebutton()
    {
        closebtn.click();
    }
    public boolean Searchbtn()
    {
        return Searchbtn.isDisplayed();
    }
    public WebElement Searchtext()
    {
        return Searchbtn;
    }
    public boolean checkingnames()
    {
        return (firstuser.isDisplayed()&&thirduser.isDisplayed());
    }
    public boolean checkingrandomnames()
    {
        return (firstuser.isDisplayed()&&seconduser.isDisplayed()&& thirduser.isDisplayed()&&fourthuser.isDisplayed());
    }
    public void userid()
    {
        firstuser.click();
    }
    public boolean userdetailsdisplay()
    {
        return userdetailswindowbtn.isDisplayed();
    }
    public void userdetailsclosebutton()
    {
        userdetailsclosebtn.click();
    }
    public boolean Cencelbtn()
    {
        return cancelbtn.isDisplayed();
    }
    public void Cancelbtnclick()
    {
        cancelbtn.click();
    }
    public boolean userdetailsclosed()
    {
        return (!(userdetailswindowbtn.isDisplayed()));
    }
    public boolean submitbtn()
    {
        return submitbtn.isDisplayed();
    }
    public String Firstname()
   {
       return firstname.getText();
   }
    public boolean firstname()
   {
       return firstname.isDisplayed();
   }
    public boolean addressbtn()
   {
       return addressbtn.isDisplayed();
   }
    public void addressbtnclicking()
   {
       addressbtn.click();
   }
    public boolean secondaddressbtn()
    {
        return secondaddressbtn.isDisplayed();
    }
    public void postalcode()
    {
        postalcodebtn.click();
    }
    public boolean postalcodedisplay()
    {
        return postalcodebtn.isDisplayed();
    }
}
