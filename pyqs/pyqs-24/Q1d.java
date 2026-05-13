//Write a program to find factorial of number using recursion. (Take number from user).
import java.util.*;

public class Q1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1d obj = new Q1d();
        System.out.println("Enter the number to find its factorial");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number is "+obj.fact(n));
        sc.close();
    }
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}

