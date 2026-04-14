//Write a Java program to reverse a given string.
import java.util.*;
public class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse");
        String s = sc.next();
        String rev="";
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            rev = rev +s.charAt(i);
        }
        System.out.println("The original string is : "+ s);
        System.out.println("The reversed string is : "+ rev);
        sc.close();
    }
}