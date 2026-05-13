//Write a java program to find the smallest number in 1-D array.(Take elements of array from user).
import java.util.*;

public class Q1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1D array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < n; i++){
            a[i]= sc.nextInt();
        }
        int min = a[0];
        for(int i = 0 ; i < n; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("The smallest number in the array is "+min);
        sc.close();
    }
}