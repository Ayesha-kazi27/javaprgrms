/*
Write a Java program to calculate the volume of the sphere using Multilevel inheritance.
- The base class method will accept the radius from the user .
-A class will be derived from the base class that will have a method to find the area of circle.
-Another class derived from this class will have methods to calculate and display the volume of the sphere.
 */

import java.util.Scanner;

class radius{
    double r;
    double acceptrad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r = sc.nextDouble();
        sc.close();
        return r;
    }
}

class area extends radius{
    double a;
    double areaofcircle(){
        a = 3.14*r*r;
        return a;
    }
}
class vol extends area{
    double volume;
    void volsphere(){
        volume = (4.0/3.0)*r*a;
        System.out.println("Enter the volume of sphere "+volume);
    }
}
class volume{
    public static void main(String args[]){
        vol v = new vol();
        v.acceptrad();
        v.areaofcircle();
        v.volsphere();
    }
}