import java.util.*;
public class arms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is armstrong or not");
        String s = sc.next();
        int len = s.length();
        int n = Integer.parseInt(s);
        int temp = n;
        double arms = 0.0;
        for(int i = 1; i<=len;i++){
            int rem = temp%10;
            temp = temp/10;
            arms = Math.pow(rem,len)+arms;
        }
        if(arms == n){
            System.out.println("The number is armstrong number");
        }
        else{
            System.out.println("The number is not armstrong number");
        }
        sc.close();
    }
}