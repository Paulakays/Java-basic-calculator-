import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        System.out.println("...............\n Calculator \n..............");

        Scanner myNumbScanner = new Scanner(System.in);

        System.out.println("Addition & Subtraction of whole numbers");
        System.out.println("Please enter a whole number in the text field below and press enter;");

        System.out.println("FirstNumber;");
        int num1 = myNumbScanner.nextInt();

         System.out.println("Please enter a whole number in the text field below and press enter;");

         

        System.out.println("SecondNumber;");
        int num2 = myNumbScanner.nextInt();
        
         System.out.println("Please enter either a + or - in the text field below and press enter to get the result;");
        char operator = myNumbScanner.next().charAt(0);

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
        
            case '-':
            result = num1 - num2;
                break;
                 default:
                        throw new IllegalStateException("Unexpected value: " + operator);
        }
        System.out.println("=" + result);
               

    }
}