import java.util.*;
public class ifprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not");
        int n = sc.nextInt();
        int isprime = 1;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                System.out.println("This number is not a prime number");
                isprime = 0;
                break;
            }else{
                isprime =1;
            }
        }
        if (isprime==1){
            System.out.println("its is a prime number");
        }
        sc.close();
    }
}