package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResult {
    public static void main(String[] args) throws InterruptedException {

   // set the property of the chromedriver
   System.setProperty("webdriver.chrome.driver" ,"src/main/resources/chromedriver.exe");
   // define the webdriver
        WebDriver driver = new ChromeDriver();

        //navigate to google home
        driver.navigate().to("https://www.google.com");

        // maximize the driver
        driver.manage().window().maximize();


        //enter a keyword on google search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys( "cars");
        Thread.sleep( 1000);

        //hit submit on google search field
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

       //new page appears so put additional wait
        Thread.sleep( 3000);

        // capture the search result but only print out the search number
        String searchResults = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
//split and extract out the search number
String[] arrayResults = searchResults.split( " ");
//print the search number
         System.out.println("My search number is " + arrayResults[1]);





    }// end of main
}//end of class
