import java.util.*;
public class eveodd {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is an even number");
        }
        else{
            System.out.println(n+" is an odd number");
        }
        sc.close();
    }
}
