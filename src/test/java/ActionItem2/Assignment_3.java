
package ActionItem2;

public class Assignment_3 {
    public static void main(String[] args) {
String[] Cities;

Cities = new  String[4];

Cities[0] = "Brooklyn";
Cities[1] =  "Queens";
Cities[2] = "Manhattan";
Cities[3] = "Staten Island";


        for (int i = 0; i < Cities.length; i++) {
            if (Cities[i] == "Brooklyn"){
                System.out.println("City is " + Cities[i]);

            } else if (Cities[i] == "Manhattan"){
                System.out.println("City is " + Cities[i]);

            }// end of conditional statements
        }// end of for the loop

    }//end of main
}//end of class

