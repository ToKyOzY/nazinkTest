package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

public class TestPage extends ReusableMethods {
    public TestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "#inputEmail")
    public WebElement email;

     @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath="//*[@class='list-group']")
    public WebElement groupList;

    @FindBy(xpath="(//*[@class='list-group-item justify-content-between'])[2]")
    public WebElement list2;

    @FindBy(xpath="(//*[@class='badge badge-pill badge-primary'])[2]")
    public WebElement listItemsValue6;

    @FindBy(xpath="//*[@id='dropdownMenuButton']")
    public WebElement option1;

    @FindBy(linkText="Option 3")
    public WebElement option3;


    @FindBy(xpath="(//*[text()='Option 3'])[1]")
    public WebElement assertOption3;

    @FindBy(xpath="(//*[@class='btn btn-lg btn-primary'])[2]")
    public WebElement buttonEnable;

    @FindBy(xpath="(//*[text()='Button'])[2]")
    public WebElement buttonDisable;

    @FindBy(xpath="//*[@id='test5-button']")
    public WebElement button5Test;

    @FindBy(xpath="//*[@id='test5-alert']")
    public WebElement buttonMessage;

    @FindBy(xpath="//*[text()='Ventosanzap']")
    public WebElement ventosanzap;






}
