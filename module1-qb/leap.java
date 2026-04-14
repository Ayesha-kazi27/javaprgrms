import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to find of it is leap yearr or not");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400 ==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}