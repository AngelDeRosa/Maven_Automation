package Day14_041821;

import ReusableLibrary.Abstract_Class;
import Google_object_class.Base_Class;
import org.testng.annotations.Test;

public class Google_Search_PageObject extends Abstract_Class {


    @Test
    public void googleSearch()throws InterruptedException{
        driver.navigate().to("https://www.google.com");
                Thread.sleep(2500);
        Base_Class.googleHomePage().EnterKeywordOnGoogleSearch("cars");
        Base_Class.googleHomePage().SubmitOnGoogleSearchButton();
             Thread.sleep(2000);
             Base_Class.search_result().getSearchNumber();

    }

}
