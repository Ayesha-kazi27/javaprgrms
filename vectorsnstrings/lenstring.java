//Write a Java program to find the length of a given string.
import java.util.*;
public class lenstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to find its length");
        String s = sc.next();
        int len = s.length();
        System.out.println("The length of string is : "+ len);
        sc.close();
    }
}