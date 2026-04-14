
//recursive fact
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fact ft = new fact();
        System.out.println("Enter the number to find factorial");
        int n = sc.nextInt();
        int res = ft.factorial(n);
        System.out.println("The factorial of "+n+" is "+res);
        sc.close();
    }
     int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
