//Write a program to find the sum of all elements in a 2D array.
import java.util.*;
public class summof2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements of array");
        int sum = 0;
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of elements are : "+sum);
        sc.close();
    }
}