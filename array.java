import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of the array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the elements of array");
        int a[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println("The sum of diagonal elements is "+sum);
        sc.close();
    }
}