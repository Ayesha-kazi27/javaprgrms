package basics;
import java.util.*;
public class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        power pw = new power();
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Enter its power");
        int n = sc.nextInt();
        System.out.println(x+" Raise to "+n+" is "+pw.exp(x,n));
        sc.close();        
    }
    int exp(int x,int n){
        if (n==0) {
            return 1;
        }
        else{
            return x*exp(x, n-1);
        }
    }
}