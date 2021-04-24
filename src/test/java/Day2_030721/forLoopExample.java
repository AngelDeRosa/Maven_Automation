package Day2_030721;

public class forLoopExample {
    public static void main(String[] args) {
        String[]Cities;

        Cities = new String[4];
        Cities[0] = "Brooklyn";
        Cities[1] = "Queens";
        Cities[2] = "Manhattan";
        Cities[3] = "Bronx";

        //set your iteration to loop through all the values from cities

        for (String city : Cities ) {
            //print out all the values in one print statement
            System.out.println("my city is " + city);


        }//end of for loop


}//end of main
}//end of java class;
