package personalReview;

public class reviewFortheLoop {
    public static void main(String[] args) {
        String[]Cookies;
        Cookies = new String[5];

        Cookies[0] = "Vanilla";
        Cookies[1] = "Chocolate";
        Cookies[2] = "Almond";
        Cookies[3] = "sugar";
        Cookies[4] = "Peanutbutter";
        // set iteration to loop through all the values from cities

        for (String cookie : Cookies){
            // print out all the values in one print statement
            System.out.println("My Favorite cookies are " + cookie);

        }// end of loop
    }// end of main
}// end of class




