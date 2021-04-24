package Day3;

import java.util.concurrent.Callable;

public class LoopWithConditionalStatements {
    public static void main(String[] args) {
        String[]  Countries = new String[4];
        Countries[0] = "USA";
        Countries[1] = "Canada";
        Countries[2] = "Bangladesh";
        Countries[3] = "India";

    // using for loop print only when country is USA or Canada
    for (int i = 0; i < Countries.length; i++) {
       if (Countries[i] == "USA"){
           System.out.println("Country is " + Countries[i]);

       } else if (Countries[i] == "Canada"){
           System.out.println("Country is " + Countries[i]);

       }// end of conditional statements
    }// end of for the loop


// using for loop with case statement print only when country is USA or Canada
     for (int i = 0; i < Countries.length; i++) {
 switch (Countries[i]) {
     case "USA":
         System.out.println("Country is " + Countries[i]);
         break;
     case "Canada":
         System.out.println("Country is " + Countries[i]);
         break;
 }// end of case statements
     }// end of loop
}//end of main method
}//end of class
