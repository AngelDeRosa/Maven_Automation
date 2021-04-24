package Express_Object_Class;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensHoodie_page extends Abstract_Class {

    //declare a local logger so you can use it in your page class
    ExtentTest logger;

    public MensHoodie_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    @FindBy(xpath = "//a[@class='_2EWqA']")
    WebElement Hoodie;


    public void ClickFirstHoodie (){
        Reusable_Actions_PageObject.clickOnElement(driver,Hoodie,logger,"first hoodie");
    }

}
