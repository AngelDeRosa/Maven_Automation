package Day_12;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_action;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class googleSearch_HTMLReport extends Abstract_Class {
    @Test
    public void SearchForACar() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2500);
        //search for a car
        Reusable_action.sendKeysMethod(driver,"//*[@name='q']","cars",logger,"Search Field");
        //submit on google search button
        Reusable_action.submitOnElement(driver,"//*[@name='btnK']",logger,"Google Search");
        Thread.sleep(3000);
    }//end of test 1

    @Test(dependsOnMethods = "SearchForACar")
    public void getSearchNumber(){
        String result = Reusable_action.captureText(driver,"//*[@id='result-stat']",0,logger,"Google Search Result");
        String[] arrayResult = result.split(" ");
        logger.log(LogStatus.INFO,"My search number is " + arrayResult[1]);
    }//end of test 2









}//end of main
