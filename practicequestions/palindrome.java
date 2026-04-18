import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if palindrome or not");
        int n = sc.nextInt();
        int temp = n , rev = 0, rem = 0;
        while(temp!=0){
            rem = temp%10;
            rev = (rev*10)+rem;
            temp = temp/10;
        }
        if(rev==n){
            System.out.println("The given number is palindrome");
        }else{
             System.out.println("The given number is not palindrome");
        }
        sc.close();
    }
}