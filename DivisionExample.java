import java.util.*;

public class DivisionExample{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        String firstInput = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondInput = scanner.nextLine();

    performDivision(firstInput , secondInput);
    scanner.close();
    }
    public static void performDivision(String firstInput , String secondInput ){
    try{
        int numerator = Integer.parseInt(firstInput);
        int denominator = Integer.parseInt(secondInput);

        int result = numerator/ denominator;
        System.out.println("Result: "+result);
    }
    catch(ArithmeticException e){
        System.out.println("ERROR: Division by ZERO is not allowed.");
    }
    catch(NumberFormatException e){
        System.out.println("ERROR: Please enter a valid INTEGER.");
    }
    catch(Exception e){ 
        System.out.println("ERROR: An unexpected error occured. "+e.getMessage());
    }
}

}
