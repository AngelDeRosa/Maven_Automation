package Express_Object_Class;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Page extends Abstract_Class {
    ExtentTest logger;

    public Product_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of local logger

    //define all the WebElement you need using @FindBy concept
    //add bag

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//button[@aria-label='Select s Size']")
    WebElement size;

    @FindBy (xpath = "//*[@class='btn _9yfmt _194FD _2tFXQ _3yOD6 _1Qp1L _2veMA']")
WebElement addTobag;

    //view Bag
    @FindBy (xpath ="//*[text()='View Bag']")
WebElement viewbag;

    @FindBy(xpath = "//*[@aria-label='Continue to Checkout']")
    WebElement checkout;



    //size
    public void Size(){
        Reusable_Actions_PageObject.clickOnElement(driver,size,logger,"click on size");
    }//end of method

    //add bag
    public void AddTOBag() {
        Reusable_Actions_PageObject.clickOnElement(driver, addTobag, logger, "add to bag");
    }  //end of add to bag

    //Click on view bag
    public void ViewBag(){
        Reusable_Actions_PageObject.clickOnElement(driver,viewbag,logger,"View Bag");
    }//end of view bag

    //Click on checkout
    public void Checkout(){
        Reusable_Actions_PageObject.clickOnElement(driver,checkout,logger,"checkout");
    }//end of view bag

}//end of class