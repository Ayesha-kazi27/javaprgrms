//WAP to make a class Circle. It should have three methods namely: accept radius, calculate area and display area.
import java.util.*;
public class circle {
    public static void main(String[] args) {
        circle cr = new circle();
        double r = cr.accept_radius();
        double area = cr.area(r);
        cr.disp(area);
    }
    double accept_radius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r = sc.nextDouble();
        sc.close();
        return r;
    }
    double area(double r){
        return r*r*3.14;
    }
    void disp(double area){
        System.out.println("The area of circle is "+ area);
    }
}