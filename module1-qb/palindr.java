import java.util.*;
public class palindr {
       public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        int rem = 0;
        while (temp>0){
            rem = temp%10;
            rev = rev*10 +rem;
            temp = temp/10;
        }
        if (n==rev){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }
        sc.close();
    }
}
