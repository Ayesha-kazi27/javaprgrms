//Write a Java program to find the area of a circle using single Inheritance such that the base class must have a method to
//accept the radius from the user and the derived class must have method to calculate and display the area.
import java.util.*;
class circle{
    double radius;
    double inputradius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius = sc.nextDouble();
        sc.close();
        return radius;
    }
}
class areaofcirc extends circle{
    double calculate(double radius){
    double area =3.14*radius*radius;
    return area;
    }  
    void disp(double area){
        System.out.println("Area of circle is "+area);
    }
}
public class area {
    public static void main(String[] args) {
        areaofcirc c1 = new areaofcirc();
        double radius = c1.inputradius();
        double area = c1.calculate(radius);
        c1.disp(area);
    }
}