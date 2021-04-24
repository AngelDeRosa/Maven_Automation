package Day2_030721;

public class linearArray {

    public static void main(String[] args) {
        //declare the  variables
        String[] cities,countries, locations;
        int[] streetNumber,houseNumber;

        cities = new String[]{"brooklyn","Queen","Manhattan,Bronx,staten Island"};
        streetNumber = new int[]{222, 345, 888, 1000};
        //I want to print queens and street number as 222;
        System.out.println("My city is "   +  cities [1] + " and street number "  + streetNumber[0]);

        countries= new String[]{"Australia","Canada","Germany","china"};
        houseNumber = new int[]{2222,3333,4444,5555,};
        //want to print countries with house numbers 2222;
        System.out.println( "countries " + countries [1] + " house Number " + houseNumber[0]);

       locations = new String[]{"11218","10004"};
       streetNumber= new int[]{222,343};
       // print the street number is with the location number;
        System.out.println("The street number is " + streetNumber [1] + " with the location number " + locations [0]);

    }//end of main method

    }//end of java class