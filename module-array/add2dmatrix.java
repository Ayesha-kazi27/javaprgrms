//Write a program to perform the addition of two matrices using a 2D array.
import java.util.*;
public class add2dmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][]=new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Enter the elements of the 1st array");
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd array");
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                b[i][j] = sc.nextInt();
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("The sum of both the matrix is : ");
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}