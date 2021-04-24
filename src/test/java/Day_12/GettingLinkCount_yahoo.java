package Day_12;

import ReusableLibrary.Abstract_Class;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;

public class GettingLinkCount_yahoo extends Abstract_Class {


@Test
    public void linkCount() throws IOException,InterruptedException {

    driver.navigate().to("https://wwww.yahoo.com");
    Thread.sleep(3000);


    //store the arraylist with class attribute for the links
    ArrayList<WebElement> linkCount = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb')]")));
    //print out the count of the links
    System.out.println("Link count is " + linkCount.size());

//I want to click on each link and navigate back to the home page
    for (int i = 0; i < linkCount.size(); i++) {
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        linkCount.get(i).click();
        Thread.sleep(2000);
    }


}















}//end of class
