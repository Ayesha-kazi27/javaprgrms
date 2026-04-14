import java.util.*;
public class recursfibon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for fibonacci series");
        int n = sc.nextInt();
        recursfibon fibo = new recursfibon();
        System.out.println("The elements of fibonacci series are: ");
        for(int i=0;i<=n;i++){
            System.out.print(fibo.fibonacci(i)+" ");
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