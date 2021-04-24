package Express_Object_Class;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bag_Page extends Abstract_Class {

    ExtentTest logger;

    public Bag_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class


    @FindBy(xpath ="//*[@aria-label='Quantity 1']")
    WebElement Qty;

    @FindBy(xpath ="//*[@class='btn _9yfmt _194FD _2tFXQ _1s_-v']")
    WebElement CheckOut;


    @FindBy(xpath ="//*[@class='_1UFak _2YpK4 _1f9t- _2yrqS']")
    WebElement CheckOUtGuest;


    public void ClickonQty(String userValue) {
Reusable_Actions_PageObject.dropdownByText(driver,Qty,userValue,logger,"click on qty");
      //  Reusable_Actions_PageObject.closePopupIfExist(driver,Qty, logger, "Click on qty");
    }//end of click on quantity



    public void ClickCheckOut () {

        Reusable_Actions_PageObject.closePopupIfExist(driver,CheckOut, logger, "Checkout");
    }//end of click on check out


    public void ClickCheckOutGuest() {

        Reusable_Actions_PageObject.closePopupIfExist(driver,CheckOUtGuest, logger, "Checkout");
    }//end of click on check out guest






}//end of class
