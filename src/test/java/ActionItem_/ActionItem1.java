package ActionItem_;

public class ActionItem1 {
    public static void main(String[] args) {

        //declare zipcodes variable
        String[] zipcodes;

        //declare int variable
        int[] streetNumber;


        //set the length of the array for number
        zipcodes = new String[4];

        zipcodes[0] = "11215";
        zipcodes[1] = "11216";
        zipcodes[2] = "11217";
        zipcodes[3] = "11218";


        //set the length of the array street number
        streetNumber = new int[4];

        streetNumber[0] = 2215;
        streetNumber[1] = 2216;
        streetNumber[2] = 2217;
        streetNumber[3] = 2218;

//set the iteration to loop
        for (int i = 0; i < zipcodes.length; i++) {
            System.out.println("The zip code is " + zipcodes[i] + " and the street number is "
                    + streetNumber[i]);


        } //end of the loop


    }//end main
}// end of ActionItem1

