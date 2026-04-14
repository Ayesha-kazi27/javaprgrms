import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        avg avegg=new avg();
        System.out.println("Enter the number to calculate avg");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(avegg.average(a,b,c));
        sc.close();
    }
    double average(double a ,double b,double c){
        return (a+b+c)/3;
    }
}