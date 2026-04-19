import java.util.*;

public class arr2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2d array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of the 2d array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        int iffound = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at index: " + i + " " + j);
                    iffound = 1;
                    return;
                }
            }
        }
        if(iffound == 0){
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}