package ActionItem4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class usps1try {
    public static void main(String[] args) throws InterruptedException {

        //kill all chrome instances that are opened
//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
//set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();
//maximize my driver
        options.addArguments("start-maximized");
//set the driver to incognito(private)
        options.addArguments("incognito");
//set it to headless
//options.addArguments("headless");
//define the webdriver
        WebDriver driver = new ChromeDriver(options);

//array list where you can keep adding
        ArrayList<String> FindZipcode = new ArrayList<>();
        FindZipcode.add("11217");
        FindZipcode.add("11218");
        FindZipcode.add("11210");

        ArrayList<String> LocationT = new ArrayList<>();
        LocationT.add("Collection Boxes");
        LocationT.add("Self-Service Kiosks");
        LocationT.add("National Retailer");

        ArrayList<String> Miles = new ArrayList<>();
        Miles.add("10 Miles");
        Miles.add("25 Miles");
        Miles.add("100 Miles");

//for loop to iterate
        for (int i = 0; i < FindZipcode.size(); i++) {


//navigate to usps home page
            try {
                driver.navigate().to("https://www.usps.com/");
            } catch (Exception e) {
                System.out.println("Unable to navigate to USPS. " + e);
          }//end of navigate exception
//verify the title

            String actualTitle = driver.getTitle();
            if (actualTitle.equals("welcome USPS")) {
                System.out.println("Match Title");
                //verify the title matches
            } else {
                System.out.println("Title  match " + actualTitle);
            }//end of else


            //  define the mouse actions
            Actions actions = new Actions(driver);

//hover to send tab

//hover to Send tab
            try {
                //store your element as WebElement
                WebElement send = driver.findElement(By.xpath("//a[@id='mail-ship-width']"));
                //move your mouse actions to send from dropdown to appear
                //you always end your mouse actions with .perform()
                actions.moveToElement(send).perform();
            } catch (Exception e) {
                System.out.println("Unable to hover to send. " + e);
            }//end of quick tools exception
//click on find usps  using mouse actions
            try {

           WebElement Location=driver.findElement(By.xpath("//a[text()='Find USPS Locations']"));
                actions.moveToElement(Location).click().perform();
            } catch (Exception e) {
                System.out.println("Unable to click on track a package. " + e);
            }//end of exception

//enter zipcode
            try {
                //store your element as WebElement
                WebElement FindL = driver.findElement(By.xpath("//*[@id='city-state-input']"));
                FindL.clear();
                FindL.sendKeys(FindZipcode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter zipcode. " + e);
            }//end of tracking input exception
//enter find Location
            try {
                driver.findElement(By.xpath("//*[@value='PO']")).click();
                WebElement dropdown = driver.findElement(By.xpath("//*[text()='" + LocationT.get(i) + "']"));
                actions.moveToElement(dropdown).click().perform();

            } catch (Exception e) {
                System.out.println("unable to select location Type");
            }//end of  location type exception


            //enter Miles
            try {
                driver.findElement(By.xpath("//*[@id='within-select']")).click();
                WebElement dropdown2 = driver.findElement(By.xpath("//*[text()='" + Miles.get(i) + "']"));
                actions.moveToElement(dropdown2).click().perform();

            } catch (Exception e) {
                System.out.println("unable to click on miles");
            }//end of Location exception


//click on search
            try {
                 driver.findElement(By.xpath("//*[@role='button']")).click();

            } catch (Exception e) {
                System.out.println("Unable to click on search . " + e);
            }//end of search icon exception

            Thread.sleep(2000);


            //arrayList links and if condition


            try {
                ArrayList<WebElement> Links = new ArrayList<>(driver.findElements(By.xpath("//*[@class='list-item-location popover-trigger']")));

                if (i ==0) {
                    Links.get(i).click();
                } else if (i ==1) {
                    Links.get(i).click();

                } else if (i ==2) {
                    Links.get(i).click();
                }//end of if condition

            } catch (Exception e) {
                System.out.println("unable to links");
            }// end of try

// capture the address and print out address print
            try {
                String Address = driver.findElement(By.xpath("//div[@class=' address-wrapper']")).getText();
                System.out.println("For ZipCode " + FindZipcode.get(i)+ " The address " + Address);
            } catch (Exception e) {
                System.out.println("unable to print address ");
            }//end of catch


            //capture hours
            try {
                String hours = driver.findElement(By.xpath("//div[@class='hours-flex-section']")).getText();
                System.out.println(hours);
            } catch (Exception e){
                System.out.println("unable to print out hours");
            }// end of catch










        }//end loop
    }//end main
}//end of class
