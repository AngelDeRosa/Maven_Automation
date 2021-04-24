package Express_Object_Class;

import ReusableLibrary.Abstract_Class;

public class ExBase_Class extends Abstract_Class {
    //this page class is a static reference for the page object classes
    //so I can use it on my test class


    public static Express_Home ExpressHomePage() {
        Express_Home ExpressHomePage = new Express_Home(driver);
        return ExpressHomePage;
    }  //end of expressHomePage method


    public static  MensHoodie_page mensHoodiesPage(){
        MensHoodie_page mensHoodiesPage= new MensHoodie_page(driver);
        return mensHoodiesPage;
}//end of mens hoodie page

   public static  Product_Page productPage(){
        Product_Page productPage= new Product_Page(driver);
        return productPage;
   } //end of product page


   public static Bag_Page bagPage(){
        Bag_Page bagPage= new Bag_Page(driver);
        return bagPage;
   }

    public static CheckOut_Page checkOutPage(){
        CheckOut_Page checkOutPage= new CheckOut_Page(driver);
        return checkOutPage;
    }




}//end of public class


