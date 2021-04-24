package ActionItem_7;

import Express_Object_Class.ExBase_Class;
import Express_Object_Class.Express_Home;
import Google_object_class.Base_Class;
import ReusableLibrary.Abstract_Class;
import org.testng.annotations.Test;



public class ExpressObject_Class  extends Abstract_Class {

    @Test
    public void ExpressSearch()throws InterruptedException {
        driver.navigate().to("https://www.express.com");
        Thread.sleep(2000);
        //home Page
        ExBase_Class.ExpressHomePage().closePopupIfExist();
        ExBase_Class.ExpressHomePage().MouseHoverToMen();
        ExBase_Class.ExpressHomePage().ClickOnSweatShirts();
Thread.sleep(3000);
         ExBase_Class.mensHoodiesPage().ClickFirstHoodie();
Thread.sleep(2000);
         ExBase_Class.productPage().Size();
         ExBase_Class.productPage().AddTOBag();
         ExBase_Class.productPage().ViewBag();
Thread.sleep(2000);
         ExBase_Class.bagPage().ClickonQty("1");
         ExBase_Class.bagPage().ClickCheckOut();
         ExBase_Class.bagPage().ClickCheckOutGuest();
Thread.sleep(2000);

         ExBase_Class.checkOutPage().firstname("Bernie");
         ExBase_Class.checkOutPage().lastname("Oreo");
         ExBase_Class.checkOutPage().emailaddress("Bernie05@gmail.com");
         ExBase_Class.checkOutPage().confirmemailaddress("Bernie05@gmail.com");
         ExBase_Class.checkOutPage().phonenumber("903-572-7344");
         ExBase_Class.checkOutPage().clickoncontinue();
         ExBase_Class.checkOutPage().shippingname("Bernie");
         ExBase_Class.checkOutPage().shippingLastname("Oreo");
         ExBase_Class.checkOutPage().streetaddress("1621 GreenHollow ln.");
         ExBase_Class.checkOutPage().postalcode("75455");
         ExBase_Class.checkOutPage().shippingcity("Mt.Pleasant");
         ExBase_Class.checkOutPage().shippingstate("Texas");
         ExBase_Class.checkOutPage().Continue();
         ExBase_Class.checkOutPage().continue2();
         ExBase_Class.checkOutPage().creditcard("4578456256439170");
         ExBase_Class.checkOutPage().expmonth("10");
         ExBase_Class.checkOutPage().expyear("23");
         ExBase_Class.checkOutPage().securitycode("122");
         ExBase_Class.checkOutPage().placeordered();
         ExBase_Class.checkOutPage().NotificationM();




    }
}



