import java.util.*;

public class overload {
    double area(double r){
        return 3.14*r*r;
    }
    double area(double l, double b){
        return l*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape to find its area \n1. circle \n2. rectangle \n3. Triangle");
        int n = sc.nextInt();
        overload a = new overload();
        switch (n) {
            case 1:
                System.out.println("Enter the radius ");
                double r = sc.nextDouble();
                System.out.println(a.area(r));
                break;
            case 2:
                System.out.println("Enter the length and breadth ");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                System.out.println(a.area(l,w));
                break;
            case 3:
                System.out.println("Enter the base and height ");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println((a.area(b,h))/2);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}