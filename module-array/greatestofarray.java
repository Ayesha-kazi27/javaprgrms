import java.util.*;
public class greatestofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the elemnets of array");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int greatest = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]> greatest){
                 greatest = arr[i];
            }
        }
        System.out.println("the greatest of array's elements is "+greatest);
        sc.close();
    }
}
