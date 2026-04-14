package basics;
//method overloading
import java.util.*;
public class area {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        area arr = new area();
        System.out.println("Enter the radius of the circle to find its area:");
        double r = sc.nextDouble();
        System.out.println("Enter the length and breadth of rectangle to find its area");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area of circle is "+arr.areaa(r));
        System.out.println("Area of rectangle is "+arr.areaa(l,b));
        sc.close();
    }
    double areaa(double r){
        return 3.14*r*r;
    }
    double areaa(double l,double b){
        return l*b;
    }
}