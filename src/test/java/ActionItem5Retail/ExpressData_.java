package ActionItem5Retail;

import Day9.Reusable_Method;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ExpressData_ {
    public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {




//set the driver using reusable method
        WebDriver driver = Reusable_Method.defineTheDriver();






//Step1: locate the path for readable file that we created in excel
          Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/ExpressDataDriven.xls"));

//Step 2: create a writable workbook that will mimic the data from readable
           WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/ExPressTest_results.xls"),readableBook);

//Ste3 : read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);


//Step 4: get the row count
        int rowCount = writableSheet.getRows();

//this is where the for loop will start to iterate through your excel data
       for(int i =1; i <rowCount; i++) {

           //columns are hard coded and row is dynamic(i)
           String size = writableSheet.getCell(0, i).getContents();
           String quantity = writableSheet.getCell(1, i).getContents();
           String FName = writableSheet.getCell(2, i).getContents();
           String LName = writableSheet.getCell(3, i).getContents();
           String Email = writableSheet.getCell(4, i).getContents();
           String phoneN = writableSheet.getCell(5, i).getContents();
           String Address = writableSheet.getCell(6, i).getContents();
           String Zipcode = writableSheet.getCell(7, i).getContents();
           String city = writableSheet.getCell(8, i).getContents();
           String state = writableSheet.getCell(9, i).getContents();
           String CCNumber = writableSheet.getCell(10, i).getContents();
           String expMonth = writableSheet.getCell(11, i).getContents();
           String expYear = writableSheet.getCell(12, i).getContents();
           String cvvCode = writableSheet.getCell(13, i).getContents();

           //navigate to express
           driver.navigate().to("https://www.express.com/");
           //delete cookie
           driver.manage().deleteAllCookies();
           Thread.sleep(2000);

//close popup
           Reusable_Method.clickOnElement(driver, "//button[@id='closeModal']", "Pop up");

//MouseHover to men
           Reusable_Method.MouseHover(driver, "//a[@href='/mens-clothing']", "Men's Tab");
           Thread.sleep(1000);
//click on sweater
           Reusable_Method.clickOnElement(driver, "//a[@href='/mens-clothing/shirts/hoodies-sweatshirts/cat1490006']", "Sweatshirt and hoodies");
           Thread.sleep(1000);
//click on the first hoodie
           Reusable_Method.clickOnElement(driver, "//*[text()='Black Logo Graphic Hoodie']", "first Sweater");
           Thread.sleep(1000);
//select the sizes
           Reusable_Method.clickOnElement(driver, "//*[text()='" + size + "']", "Size");
           Thread.sleep(1000);
//click on bag
           Reusable_Method.clickOnElement(driver, "//*[@class='btn _9yfmt _194FD _2tFXQ _3yOD6 _1Qp1L _2veMA']", "Add to bag");
           Thread.sleep(1000);

//click on view bag
           Reusable_Method.clickOnElement(driver, "//*[text()='View Bag']", "click on view bag");


//change the quantity
           Reusable_Method.clickOnElement(driver, "//*[@value='" + quantity + "']", "Qty");

//CLick on checkout
           Reusable_Method.clickOnElement(driver, "//*[@aria-label='Continue to Checkout']", "continue to check out");

//click on continue as guest
           Reusable_Method.clickOnElement(driver, "//button[text()='Checkout as Guest']", "continue to check out");


//Enter first name
           Reusable_Method.sendKeysMethod(driver, "//*[@name='firstname']", FName, "First Name");

//Enter last name
           Reusable_Method.sendKeysMethod(driver, "//*[@name='lastname'] ", LName, "Last Name");

//Enter Email

           Reusable_Method.sendKeysMethod(driver, "//*[@name='email'] ", Email, "Email Address");
//reenter email
           Reusable_Method.sendKeysMethod(driver, "//*[@name='confirmEmail'] ", Email, "Email Address");
//Phone number

           Reusable_Method.sendKeysMethod(driver, " //*[@name='phone']", phoneN, "Phone Number");


//click on continue
           Reusable_Method.clickOnElement(driver, " //button[@type='submit']", "continue");


//enter street address
           Reusable_Method.sendKeysMethod(driver, " //*[@name='shipping.line1']", Address, "Street Address");
//Enter zip code
           Reusable_Method.sendKeysMethod(driver, "//*[@name='shipping.postalCode'] ", Zipcode, "Postal Code");
//Enter city
           Reusable_Method.sendKeysMethod(driver, " //*[@name='shipping.city']", city, "City");

//Select state
           Thread.sleep(1000);
           Reusable_Method.dropdownByText(driver, "//*[@name='shipping.state']", state, "State");

           Thread.sleep(1000);
//click on continue
           Reusable_Method.clickOnElement(driver, " //*[text()='Continue']", "continue");

           Thread.sleep(3000);
//click on continue
           Reusable_Method.clickOnElement(driver, "//*[text()='Continue']", "continue 2");

           Thread.sleep(1000);
//pop up closed
//Reusable_Method.clickOnElement(driver,"//*[text()='NO, THANK YOU']","pop up not closed");


//enter credit card number
           Reusable_Method.sendKeysMethod(driver, "//*[@id='creditCardNumberInput'] ", CCNumber, "Credit Card Number");

//select expiration month

           Reusable_Method.dropdownByText(driver, "//*[@name='expMonth']", expMonth, "Exp Month");

//Select expiration year
           Reusable_Method.dropdownByText(driver, "//*[@name='expYear']", expYear, "Exp Year");


//Enter cvv
           Reusable_Method.sendKeysMethod(driver, "//*[@name='cvv'] ", cvvCode, "CVV");


//click on place order
           Reusable_Method.clickOnElement(driver, "//span[text()='Place Order'] ", "place order");


//capture Error Message and write it back to excel
           String erroeMessage=Reusable_Method.captureText(driver,"//div[@class='xnY7x notification']",0,"errorMessage");

           Label label= new Label(14,i,erroeMessage);
           writableSheet.addCell(label);

       }//end of loop


         writableWorkbook.write();
       writableWorkbook.close();






        }//end of main
}//end of class
