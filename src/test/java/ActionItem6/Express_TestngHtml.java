package ActionItem6;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_action;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_TestngHtml  extends Abstract_Class {



        @Test
        public void ExpressTestngHtml () throws IOException, InterruptedException, BiffException, WriteException {


            //Step1: locate the path for readable file that we created in excel
            Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/ExpressDataDriven.xls"));

            //Step 2: create a writable workbook that will mimic the data from readable
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/ExPressTest_result.xls"), readableBook);

            //Ste3 : read everything from writable sheet
            WritableSheet writableSheet = writableWorkbook.getSheet(0);

            //Step 4: get the row count
            int rowCount = writableSheet.getRows();

         driver.navigate().to("https://www.express.com");
                     Thread.sleep(1000);
            // pop-up
            Reusable_action.clickOnElement(driver,"//button[@id= 'closeModal']",logger,"x button");


            for (int i = 1; i < rowCount; i++) {

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
                String ccNumber = writableSheet.getCell(10, i).getContents();
                String expMonth = writableSheet.getCell(11, i).getContents();
                String expYear = writableSheet.getCell(12, i).getContents();
                String cvvCode = writableSheet.getCell(13, i).getContents();

                // navigare to expess
               driver.navigate().to("https://www.express.com");
                // delete cookie
                driver.manage().deleteAllCookies();
                Thread.sleep(2000);

                //hover to men section
                Thread.sleep(1000);
                Reusable_action.mouseHover(driver, "//*[@data-menu-index='1']", logger, "Men");


                //click on sweaters
                Thread.sleep(1000);
                Reusable_action.clickOnElement(driver, "//a[text()='Sweatshirts & Hoodies']", logger, "Sweaters");

                //click on a gray sweater
                Thread.sleep(3000);
                Reusable_action.clickOnElement(driver, "//a[@class='_2EWqA']", logger, "first Sweater");

                Thread.sleep(2000);
                //click on size
                Reusable_action.clickOnElement(driver, "//*[text()='" + size + "']", logger, "sizes");

                //click on add to bag
                Thread.sleep(500);
                Reusable_action.clickOnElement(driver, "//*[@class='btn _9yfmt _194FD _2tFXQ _3yOD6 _1Qp1L _2veMA']", logger, "Add to bag");

                //click on view bag
                Thread.sleep(1000);
                Reusable_action.clickOnElement(driver, "//*[text()='View Bag']", logger, "click on cart");

                //quantity
                Reusable_action.clickOnElement(driver, "//*[@value='" + quantity + "']", logger, "number");

                //CLick on checkout
                Reusable_action.clickOnElement(driver, "//*[@aria-label='Continue to Checkout']", logger, "continue to check out");

                //click on continue as guest
                Reusable_action.clickOnElement(driver, "//button[text()='Checkout as Guest']", logger, "continue to check out");


                //Enter first name
                Reusable_action.sendKeysMethod(driver, "//*[@name='firstname']", FName, logger, "FirstName");

                //Enter last name
                Reusable_action.sendKeysMethod(driver, "//*[@name='lastname'] ", LName, logger, "LastName");

                //Enter Email
                Reusable_action.sendKeysMethod(driver, "//*[@name='email'] ", Email, logger, "email");

                //reenter email
                Reusable_action.sendKeysMethod(driver, "//*[@name='confirmEmail'] ", Email, logger, "email");

                //Phone number
                Reusable_action.sendKeysMethod(driver, " //*[@name='phone']", phoneN, logger, "phoneNumber");

                //click on continue
                Reusable_action.clickOnElement(driver, " //button[@type='submit']", logger, "continue");

                //enter street address
                Reusable_action.sendKeysMethod(driver,"//*[@name = 'shipping.line1']",Address,logger,"Address");

                //Enter zip code
                Reusable_action.sendKeysMethod(driver, "//*[@name='shipping.postalCode'] ", Zipcode,logger, "zipcodee");

                //Enter city
                Reusable_action.sendKeysMethod(driver, " //*[@name='shipping.city']", city, logger, "citye");

                //Select state
                Thread.sleep(1000);
                Reusable_action.dropdownByText(driver, "//*[@name='shipping.state']",state,logger,"state");

                Thread.sleep(1000);
                //click on continue
                Reusable_action.clickOnElement(driver, " //*[text()='Continue']", logger, "continue");

                Thread.sleep(3000);
                //click on continue
                Reusable_action.clickOnElement(driver, "//*[text()='Continue']", logger, "2ndcontinue");

                //enter credit card number
                Thread.sleep(3000);
                Reusable_action.sendKeysMethod(driver, "//*[@name='creditCardNumber'] ", ccNumber, logger, "ccNumber");

                //select expiration month
                Thread.sleep(1000);
                Reusable_action.dropdownByText(driver, "//*[@name='expMonth']", expMonth,logger,"ExpiredMonth" );

                //Select expiration year
                Thread.sleep(1000);
               Reusable_action.dropdownByText(driver, "//*[@name='expYear']", expYear,logger,"ExpiredYear");

                //Enter cvv
                Thread.sleep(1000);
                Reusable_action.sendKeysMethod(driver, "//*[@name='cvv'] ", cvvCode, logger, "cvvCodee");

                //click on place order
                Thread.sleep(1000);
                Reusable_action.clickOnElement(driver, "//span[text()='Place Order'] ", logger, "place order");


                //capture errorMessage and write it back to excel
                String errorMessage = Reusable_action.captureText(driver,"//*[@id='rvn-note-NaN']",0,logger,"captureErrorMessageXl");

                Label label = new Label(14,i,errorMessage);
                //add the label back to the sheet
                writableSheet.addCell(label);

                //write it back to html
                Reusable_action.captureText(driver, "//*[@id='rvn-note-NaN']", 0, logger, "captureErrorMessageHtml");

                logger.log(LogStatus.INFO, "My error message is " + errorMessage );


            }//end of for loop

            //Write back to WorkBook and close it
            writableWorkbook.write();
            writableWorkbook.close();

        }//end of test









}//public class



