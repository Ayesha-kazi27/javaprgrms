import java.util.*;

public class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find the palindrome");
        String s = sc.next();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if(rev == s){
            System.out.println("The given string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }

        sc.close();
    }
} // wrong code