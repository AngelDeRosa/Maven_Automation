package Day2_030721;

public class dynamicArray {
    public static void main(String[] args) {

        //declare countries variable
        String[] countries;
        //declare int variable
        Integer[] streetNumber;

        //set the length of the array for number of data it can store
        countries = new String[4];
        countries[0] = "USA";
        countries[1] = "Spain";
        countries[2] = "Bangladesh";
        countries[3] = "india";

        //set the length of the array for street number
        streetNumber = new Integer[4];
        streetNumber[0] = 222;
        streetNumber[1] = 333;
        streetNumber[2] = 444;
        streetNumber[3] = 555;

        //Print usa from countries list
        System.out.println("country is " + countries[0]);
// print street number
        System.out.println("street number is " + streetNumber[0]);


    }//end of main method

}//end of Java
