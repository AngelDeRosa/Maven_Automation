package Day3;

public class SwitchCasesStatement {
    public static void main(String[] args) {

        //declare and define the variable for milkType
        String MilkType = "Oat Milk";

        switch (MilkType){
            case "Oat Milk":
                System.out.println("Milk type is Oat Milk");
                break;

            case "Almond Milk":
                System.out.println("Milk type is almond Milk");
                break;

            case "Organic Milk":
                System.out.println("Milk type is Organic Milk");
                break;
            default:
                System.out.println("Milk type is not recognized " + MilkType);
        }// end of switch statement
    }// end of main
}// end of class

