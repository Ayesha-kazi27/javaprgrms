//Write a program to demonstrate method overloading by overloading the methods for calculating area of circle, rectangle and triangle.
import java.util.*;

public class Q3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3c obj = new Q3c();
        System.out.println("Enter the radius,length,breadth and height to calculte area of circle,rectangle and triangle ");
        double r = sc.nextDouble();
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("The area of cirle is "+ obj.area(r));
        System.out.println("The area of rectangle is "+ obj.area(l,b));
        System.out.println("The area of triangle is "+ 0.5*obj.area(l,b));
        sc.close();
    }
    double area(double r){
        return 3.14*r*r;
    }
    double area(double l,double b){
        return l*b;
    }
}