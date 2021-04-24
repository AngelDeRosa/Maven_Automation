package Express_Object_Class;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page extends Abstract_Class {

    ExtentTest logger;

    public CheckOut_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class


    @FindBy(xpath ="//input[@name='firstname']")
    WebElement FirstName ;

    @FindBy(xpath ="//input[@class='ff8oN inputInactive _3qdvz']")
    WebElement LastName;


    @FindBy(xpath ="//input[@class='ff8oN inputInactive _3Lgrd']")
    WebElement EmailAddress ;

    @FindBy(xpath ="//*[@aria-label='Confirm Email Address']")
    WebElement ConfirmEmailAddress;

    @FindBy(xpath ="//input[@type='tel']")
    WebElement Phonenumber ;

    @FindBy(xpath ="//*[@class='btn _9yfmt _194FD _2tFXQ _2SogC']")
    WebElement ClickonContinue ;

    @FindBy(xpath ="//*[@name='shipping.firstName']")
    WebElement ShippingName ;

    @FindBy(xpath ="//*[@name='shipping.lastName']")
    WebElement ShippingLastName ;

    @FindBy(xpath = "//input[@name='shipping.line1']")
    WebElement StreetAddress;

    @FindBy(xpath ="//*[@name='shipping.postalCode']")
    WebElement Postalcode;

    @FindBy(xpath ="//*[@name='shipping.city']")
    WebElement ShippingCity ;

    @FindBy(xpath ="//*[@id=rvndd--shipping.state--5']")
    WebElement ShippingState ;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement Continue;
    @FindBy(xpath ="//button[@type='submit']")
    WebElement Continue2;

    @FindBy(xpath ="//input[@id='creditCardNumberInput']")
    WebElement CreditCard;

    @FindBy(xpath ="//*[@name='expMonth']")
    WebElement ExpMonth;

    @FindBy(xpath ="//*[@name='expYear']")
    WebElement ExpYear;


    @FindBy(xpath ="//*[@name='cvv'] ")
    WebElement SecurityCode;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement PlaceOrdered;

    @FindBy(xpath ="//*[@class='xnY7x notification']")
    WebElement notificationMessage;



    //create a method for First name
    public void firstname(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,FirstName,userValue,logger,"First Name");
    }//end of First name

    //create a method for Last Name
    public void lastname(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,LastName,userValue,logger,"Last name");
    }//end of google search

    //create a method for Address
    public void streetaddress(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,StreetAddress,userValue,logger,"Street Address");
    }//end of street address



    //create a method for email address
    public void emailaddress(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,EmailAddress,userValue,logger,"Email Address");
    }//end of email address

    //create a method for confirm email address
    public void confirmemailaddress(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,ConfirmEmailAddress,userValue,logger,"confirm email address");
    }//end of confirm email address

    //create a method for phone number
    public void phonenumber(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,Phonenumber,userValue,logger,"phone number");
    }//end of phone number

    //create a method for continue
    public void clickoncontinue () {
        Reusable_Actions_PageObject.clickOnElement(driver,ClickonContinue,logger,"Click on continue");
    }//end of click on continue

    //create a method for shipping name
    public void shippingname(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,ShippingName,userValue,logger,"shipping name");
    }//end of click on shipping name

    //create a method for shipping last name
    public void shippingLastname (String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,ShippingLastName,userValue,logger,"shipping last name");
    }//end of  shipping last name
    //create a method for

    public void postalcode (String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,Postalcode,userValue,logger,"postal code");
    }//end  of postal code

    //create a method for shipping state
    public void shippingstate(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,ShippingState,userValue,logger,"Shipping State");
    }//end  of shipping state

    //create a method for shipping city
    public void shippingcity (String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,ShippingCity,userValue,logger,"Shipping City");
    }//end  of shipping city

    //create a method for continue
    public void Continue () {
        Reusable_Actions_PageObject.clickOnElement(driver,Continue,logger,"Click on continue");
    }//end of click on continue
    public void continue2(){
        Reusable_Actions_PageObject.clickOnElement(driver,Continue2,logger,"click on continue 2");

    }//end of continue2

    //create a method for credit card
    public void creditcard (String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,CreditCard,userValue,logger,"Credit Card");
    }//end  of credit card

    //create a method for expired month
    public void expmonth  (String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,ExpMonth,userValue,logger,"expired month");
    }//end  of expired month

    //create a method for expired Year
    public void expyear  (String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,ExpYear,userValue,logger,"expired month");
    }//end  of expired Year

    //create a method for Security code
    public void securitycode(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,SecurityCode,userValue,logger,"CVV");
    }//end  of security code

    //create a method place ordered
    public void placeordered () {
        Reusable_Actions_PageObject.clickOnElement(driver,PlaceOrdered,logger,"Place ordered");
    }//end of placeordered

    public void NotificationM(){
        String result = Reusable_Actions_PageObject.captureText(driver,notificationMessage,0,logger,"Notification Message");
        String[] arrayResult = result.split(" ");
        logger.log(LogStatus.INFO,"Search number is " + arrayResult[1]);
    }
}//end of class
