package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fineElements {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the WebDriver
        WebDriver driver = new ChromeDriver();

        //navigate to google home
        driver.navigate().to( "https://www.google.com");

        //maximize
        driver.manage().window().maximize();

        Thread.sleep(  2000);

        // using findElements click on store link from the class group
        driver.findElements(By.xpath("//*[@class='MV3Tnb']")).get(1).click();




    }// end of main
}//end of class
