//Write a Java program to check whether a given string is a palindrome or not.
import java.util.*;
public class palindromestrinng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse");
        String s = sc.next();
        String rev="";
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            rev = rev +s .charAt(i);
        }

        if (s.compareTo(rev)==0){
            System.out.println("The String is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
        sc.close();
    }
}