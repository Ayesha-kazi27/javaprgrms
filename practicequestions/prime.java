import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if prime");
        int n = sc.nextInt();
        int ifprime = 0;
        for(int i=2;i<n;i++){
            ifprime = 1 ;
        }
        if(ifprime==0){
            System.out.println("The given number is prime number");
        }else{
            System.out.println("The given number is not a prime number");
        }
        sc.close();
    }
}