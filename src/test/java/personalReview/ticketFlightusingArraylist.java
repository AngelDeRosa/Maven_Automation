package personalReview;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_action;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ticketFlightusingArraylist extends Abstract_Class {


    @Test
    public void bookingFlightHtml() throws IOException, InterruptedException, BiffException, WriteException {



driver.navigate().to("https://m.cheapoair.com/");
Thread.sleep(3000);
//hover to roundtrip
Reusable_action.mouseHover(driver,"//*[@class='active primaryBg--color']",logger,"RoundTrip");
Thread.sleep(3000);
//click on New york
Reusable_action.clickOnElement(driver,"//*[@class='from-text']",logger,"click NewYOrk");
Thread.sleep(3000);
//click on from where
Reusable_action.clickOnElement(driver,"//*[@placeholder='Enter airport or city']",logger,"clickfromwhere");
Thread.sleep(2000);
//Type in JFK
Reusable_action.sendKeys(driver,"//* '- New York Kennedy, New York, United States']",logger,"Type in Jfk");
Thread.sleep(2000);
//click on where to
  //Reusable_action.clickOnElement(driver,"//[@class='p-r location valid']",logger,"click on where");
//type in my destination
//Reusable_action.sendKeys(driver,"//input[placeholder='Enter airport or city']",logger,"Type in DFW");

    }//end of test
}//of class