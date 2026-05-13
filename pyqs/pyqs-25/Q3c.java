//Write a program to accept and display the month number. Throw NumberFormatException if improper month number is entered.
import java.util.*;

public class Q3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number to check its validity");
        try{
            String s = sc.nextLine();
            int m = Integer.parseInt(s);
            if (m < 1 || m > 12) {
            // Throw NumberFormatException for out of range values
            throw new NumberFormatException("Month number must be between 1 and 12");
            }
            else{
                System.out.println("It is a valid number");
            }
        }catch(NumberFormatException n){
            System.out.println("Enter a valid number ");
        }
        sc.close();
    }
}