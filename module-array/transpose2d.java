//Write a program to find the transpose of a matrix using a 2D array.
import java.util.*;
public class transpose2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][]=new int[r][c];
        int t[][] = new int[r][c];
        System.out.println("Enter the elements of the 1st array");
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The Transpose of the matrix is : ");
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                 t[i][j]=a[j][i];
                 System.out.print(t[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}