//
import java.util.*;
public class counteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        int count = 0;
        for(int i = 0;i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){ // (arr[i]%2 != 0) => for odd
                count +=1;
            }
        }
        System.out.println("Total number of even elements in this array are : "+count);
        sc.close();
    }
}