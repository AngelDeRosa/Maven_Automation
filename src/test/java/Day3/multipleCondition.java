package Day3;

public class multipleCondition {

    public static void main(String[] args) {
        // using multiple condition statements
        int a,b,c;
        a = 2;
        b = 3;
        c = 4;


        // verify either a+b >c, a+b = c
        if(a+b > c) {
            System.out.println("a & b is greater than c");
        }else if(a+b < c){
            System.out.println("a & b is less than c");
        }else {// if previous two conditions didn't match than you can just ended with else statement
            System.out.println("a & b is equal to c");
        }//end of multiple condition


    }//end of main method

}// end of java