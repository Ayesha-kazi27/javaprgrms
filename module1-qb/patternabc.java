import java.util.*;
public class patternabc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        char c = 'A';
        for(int i = 0;i<n;i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print("*");
                c++;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
