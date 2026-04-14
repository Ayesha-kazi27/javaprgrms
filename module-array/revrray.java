//Write a program to find reverse of a one-dimensional array.
import java.util.*;
public class revrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            rev[n-i-1] = arr[i];
        }
        System.out.println("The original array is");
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The Reverse array is");
        for(int i = 0 ;i<n;i++){
            System.out.print(rev[i] + " ");
        }
        sc.close();
    }
}