import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("enter the number: "+ i);

        if(i%2==0){
            System.out.println("It is a Even Number ");
        } else {
        System.out.println("It is a Odd Number");

        sc.close();
        }

    }
    
    
}
