package ActionItem3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class REDOActionItem{
    public static void main(String[] args) {

        // set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");


        //define chromeOptions arguments
        ChromeOptions options= new ChromeOptions();
        options.addArguments("start-maximized");
//define webdriver
        WebDriver driver= new ChromeDriver(options);


//verify the title with expected
        String Actualtitle= driver.getTitle();
        String ActualTitle = "driver.getTitle()";
        if (Actualtitle.equals("Auto Loan Calculator")) {

            System.out.println("Title matches");
        }else {
            System.out.println("The title doesn't match. " + Actualtitle);
        }//end of condition

//set values  array
        //declare  variable
        String[] PurchaseP = new String[3];
        //set the length of the array for number of data it can store
        PurchaseP[0] = "295,000";//1
        PurchaseP[1] = "312,500";
        PurchaseP[2] = "400,000";

        String[] DPayment = new String[3];
        DPayment [0] = "10";//1
        DPayment [1] = "20";
        DPayment [2] = "40";

        String[] MTerm  = new String[3];
        MTerm [0] = "10";//1
        MTerm [1] = "20";
        MTerm [2] = "30";

        String[] IRate = new String[3];
        IRate [0] = "3.95";//1
        IRate [1] = "3.70";
        IRate [2] = "4.00";

        String[] PurchaseMI = new String[3];
        PurchaseMI [0] = ".40";//1
        PurchaseMI [1] = ".52";
        PurchaseMI [2] = ".55";

        String[] SMonth = new String[3];
        SMonth [0] = "Apr";//1
        SMonth [1] = "Jun";
        SMonth [2] = "Dec";

        String[] StYear = new String[3];
        StYear [0] = "2022";//1
        StYear [1] = "2024";
        StYear [2] = "2030";




for (int i =0; i<PurchaseP.length;i++ ) {

driver.navigate().to("https://www.mlcalc.com/");




    WebElement PurchasePrice = driver.findElement(By.xpath("//input[@name='ma' ]"));
    //clear previous data
    PurchasePrice.clear();
    //enter new loan Amount
    PurchasePrice.sendKeys(PurchaseP[i]);



    WebElement DownPayment = driver.findElement(By.xpath("//input[@id='dp']"));
    DownPayment.clear();
    DownPayment.sendKeys(DPayment[i]);

    WebElement MortgageTerm = driver.findElement(By.xpath("//input[@id='mt']"));
    MortgageTerm.clear();
    MortgageTerm.sendKeys(MTerm[i]);


    WebElement InterestRate = driver.findElement(By.xpath("//input[@id='ir']"));
    InterestRate.clear();
    InterestRate.sendKeys(IRate[i]);


    WebElement PMI = driver.findElement(By.xpath("//input[@id='mi']"));
    PMI.clear();
    PMI.sendKeys(PurchaseMI[i]);

    WebElement StartMonth = driver.findElement(By.xpath("//select[@name='sm']"));
    Select dropdown = new Select(StartMonth);
    dropdown.selectByVisibleText(SMonth[i]);

    WebElement StartYear= driver.findElement(By.xpath("//select[@name='sy']"));
Select dropdown2 = new Select(StartYear);
dropdown2.selectByVisibleText(StYear[i]);



driver.findElement(By.xpath("//input[@type='submit']")).click();
String results = driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();

System.out.println("The Monthly payment for year " + StYear[i]);
System.out.println(results);
}//end of for loop
    }//end of main
}//end of class

