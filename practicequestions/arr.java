import java.util.*;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int avg = sum/n;
        System.out.println("Greater than average ");
        for(int i=0;i<n;i++){
            if(a[i]>avg){
                System.out.println(a[i]);
            }
        }
        sc.close();
    }
}