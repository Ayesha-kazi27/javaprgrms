import java.util.*;

public class recursion {
    int recursive(int x,int n){
        if(n==0){
            return 1;
        }
        else{
            return x*recursive(x, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number and its power");
        int x = sc.nextInt();
        int n = sc.nextInt();
        recursion r= new recursion();
        int res = r.recursive(x,n);
        System.out.println(res);
        sc.close();
    }
}