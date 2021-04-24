package ActionItem2;

public class Assignment_1{
    public static void main(String[] args) {
        int grade = 65;


        if (grade >= 90 && grade <= 100) {

            System.out.println("grade is A");
        }else if (grade >=80 && grade<90){
            System.out.println("is grade B ");

        }else if (grade >=70 && grade<80){
            System.out.println(" is grade C");

        }else if (grade >=60 && grade<70){
            System.out.println(" is grade D");
        }else {
            System.out.println("Fail");
        }//end of condition
    }// end of main
}// end of class
