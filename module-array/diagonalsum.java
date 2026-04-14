//Write a program to calculate the sum of diagonal elements of a square matrix using a 2D array.
import java.util.*;
public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][]=new int[r][c];
        int sum = 0;
        System.out.println("Enter the elements of the 1st array");
        for(int i = 0;i < r ; i++){
            for(int j = 0;j<c;j++){
                a[i][j] = sc.nextInt();
                if(i == j)
                    sum += a[i][j];
            }
        }
        System.out.println("The sum of diagonal elements of the matrix is : " + sum);
        sc.close();
    }
}