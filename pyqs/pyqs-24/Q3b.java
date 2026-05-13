//Write a program to perform division of two numbers accepted from user. Handle the divide by zero exception using the try-catch block.
import java.util.*;

public class Q3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            double res = x/y;
            System.out.println("The result is "+res);
        }catch(ArithmeticException a){
            System.out.println("Division by zero is not possible mathematically");
        }catch(Exception e){
            System.out.println("Exception occured");
        }
        sc.close();
    }
}