package Express_Object_Class;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_Home extends Abstract_Class {
    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public Express_Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept

    @FindBy(xpath = "//button[@id= 'closeModal']")
    WebElement closePopupIfExist;
    @FindBy(xpath ="//*[@data-menu-index='1']" )
    WebElement MouseHoverToMen ;
    @FindBy(xpath = "//a[text()='Sweatshirts & Hoodies']")
    WebElement HovertoSweatshirts;




    //create a method to close popup
    public void closePopupIfExist() {

        Reusable_Actions_PageObject.closePopupIfExist(driver,closePopupIfExist, logger, "Close Popup");
    }//end of close popup

//create method for MouseHover to men
    public void MouseHoverToMen(){
        Reusable_Actions_PageObject.MouseHover(driver,MouseHoverToMen,logger,"MouseHover to men");
    }//end of MouseHover to men

    //create method for click on sweatshirts
    public void ClickOnSweatShirts(){
        Reusable_Actions_PageObject.clickOnElement(driver,HovertoSweatshirts,logger,"Click On sweatShirts");
    }// end of click on sweatshirts


}//end of public class


