package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromedriverExample {
    public static void main(String[] args) {
      //set the path to driver
      System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
      //define chromeoptions arguments
        ChromeOptions options= new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set it to headless
        // option.addArguments(headless")

        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo.page
        driver.navigate().to("https://www.yahoo.com");










    }// end of main

}// end of class
