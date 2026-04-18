import java.util.*;

public class fibon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibon f = new fibon();
        System.out.println("Enter the number of terms to find fibonnaci series");
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            System.out.print(f.fibonacci(i)+ " ");
        }
        sc.close();
    }
    int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
}