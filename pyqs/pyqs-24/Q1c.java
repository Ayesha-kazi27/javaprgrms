//Write a program to find element in 1-D array.
import java.util.*;

public class Q1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array");
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find in the given array");
        int x = sc.nextInt();
        int ifnotfound = -1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println("The given element found at index :"+i);
                ifnotfound = i;
                break;
            }
        }
        if(ifnotfound==-1){
            System.out.println("The element is not in the array");
        }
        sc.close();
    }
}