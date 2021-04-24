package personalReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReviewException {
    public static void main(String[] args) {
        //set the path to the driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set the driver to icongnito (private)
        options.addArguments("incognito");
        // define the webdriver
        WebDriver driver = new ChromeDriver(options);



try {//
    driver.navigate().to("https://www.bing.com");


}catch (Exception e){
    System.out.println("unable to navigate to bing. " + e);
}// end of search exception


// click on search icon
        try {
            driver.findElement(By.xpath("//*[@for= 'sb_form_go']")).click();
        }catch (Exception e){
            System.out.println("unable to click on search icon." + e);
        }//end off search icon




    }//end of main
}//end of class