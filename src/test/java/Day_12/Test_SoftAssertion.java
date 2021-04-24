package Day_12;

import Day9.Reusable_Method;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.yaml.snakeyaml.events.Event;

import java.io.IOException;

public class Test_SoftAssertion {

    @Test
    public  void assertions() throws IOException,InterruptedException {
        WebDriver driver = Reusable_Method.defineTheDriver();
        driver.navigate().to("https://www.google.com");
        // using hard assert verify the google title
       // Assert.assertEquals("google",driver.getTitle());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("google", driver.getTitle());
        //enter something on google search
        Reusable_Method.sendKeysMethod(driver, "//*@name='q']", "cars", "search");
        //assertAll should be the last step on your test
       softAssert.assertAll();
    } //end of test







}//end of class
