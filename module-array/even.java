//Write a program to display the even elements in a one-dimensional array.
import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Tne Even elements of array are : ");
        for(int i = 0;i < n ; i++){
            if(arr[i]%2 == 0) // (arr[i]%2 != 0) => for odd
                System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}