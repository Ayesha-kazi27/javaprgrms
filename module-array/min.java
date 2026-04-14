//Write a program to find smallest element in a one-dimensional array.
import java.util.*;
public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0;i<n;i++){
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println("The largest element of array is : "+ min);
        sc.close();
    }
}