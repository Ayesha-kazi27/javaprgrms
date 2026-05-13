//Write a program to check whether the user entered year is leap year or not.
import java.util.*;

public class Q4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check if it is a leap year");
        int yr = sc.nextInt();
        if(yr%4 == 0 && (yr%400==0 || yr%100 !=0)){
            System.out.print("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}