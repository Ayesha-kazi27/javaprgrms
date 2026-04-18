//Implement division of two numbers accepted from user. Handle the divide by zero exception using try-catch-finally block

import java.util.*;

public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to divide");
        int a = sc.nextInt(), b = sc.nextInt();
        try{
            int res = a/b;
            System.out.println("The result is "+ res);
        }catch (ArithmeticException e){
            System.out.println("You cannot divide a number by zero");
        }
        finally{
            sc.close();
        }
    }
}