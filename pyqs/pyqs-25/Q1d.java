import java.util.*;

public class Q1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if its prime or not");
        int n = sc.nextInt();
        boolean ifprime = true;
        for(int i = 2;i<n ;i++){
            if(n%i==0)
            ifprime = false;
        }
        if(ifprime==true){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
        sc.close();
    }
}