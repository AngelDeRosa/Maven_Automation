package personalReview;

public class ReviewDynamicArray {
    public static void main(String[] args) {
        // declare city variable
      String[] City;
     // declare int variable
     int[] zipCode;
     //set the length of the array for number of data it can store
        City = new String[4];

        City[0] = "Brooklyn";
        City[1] = "Manhattan";
        City[2] = "Queens";
        City[3] = "Bronx";

        // set the length of the array for zipcode
        zipCode= new int[4];
          zipCode[0] = 11218;
          zipCode[1] = 10004;
          zipCode[2] = 11354;
          zipCode[3] = 10453;

        //Print Brooklyn from the city list
        System.out.println("Cities is " + City[0] );
        //Print zip code
        System.out.println("Zipcode number is " + zipCode[0]);
    }// end of main
}// end of class


// print street number


