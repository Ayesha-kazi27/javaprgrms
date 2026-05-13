//Write a program to find sum of first ‘n’ natural numbers using recursion.
import java.util.*;

public class Q2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find sum of all natural numbers");
        int n = sc.nextInt();
        Q2b obj = new Q2b();
        int res = obj.sum(n);
        System.out.println("The sum of natural numbers is "+ res);
        sc.close();
    }
    int sum(int num){
        if(num <= 0){
            return 0;
        }
        else{
            return num + sum(num-1);
        }
    }
}