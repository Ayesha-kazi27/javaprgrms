//Write a program to display volume of sphere and hemisphere.Make use of abstract class.
import java.util.*;

abstract class vol{
    abstract void volume(double r);
}
class sphere extends vol{
    void volume(double r){
        double v = 4.0/3.0*(3.14*r*r*r);
        System.out.println("The volume of sphere is "+v);
    }
}
class hemisphere extends vol{
    void volume(double r){
        double v = 2.0/3.0*(3.14*r*r*r);
        System.out.println("The volume of hemisphere is "+v);
    }
}
public class Q3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere and hemisphere to find its volue");
        double r = sc.nextDouble();
        sphere s = new sphere();
        hemisphere h = new hemisphere();
        s.volume(r);
        h.volume(r);
        sc.close();
    }
}