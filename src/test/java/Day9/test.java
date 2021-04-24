package Day9;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = Reusable_Method.defineTheDriver();

//navigate to google
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2300);
//enter something on search field
        Reusable_Method.sendKeysMethod(driver,"//*[@name='q']","Cars","Search Field");
//click on google search
        Reusable_Method.clickOnElement(driver,"//*[@name='btnK']","Google Search");










    }//end of main
}//end of class
