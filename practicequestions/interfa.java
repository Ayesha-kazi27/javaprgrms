import java.util.*;

interface  Area {
    public void display(double r);
}

class circ implements Area{
    double pi = 3.14;
    @Override
    public void display(double r){
    double Area = pi *r*r;
    double vol = 0;
    System.out.println("The Area of circle is "+Area);
    System.out.println("The volume of circle is "+vol);
    }
}
class sphere implements Area{
    double pi = 3.14;
    @Override
    public void display(double r) {
        double Area = 4*pi*r*r;
        double vol = Area*r/3;
        System.out.println("The Area of sphere is "+Area);
        System.out.println("The volume of sphere is "+vol);
    }
}
public class interfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circ c = new circ();
        sphere s = new sphere();
        System.out.println("Enter the radius of circle");
        double r = sc.nextDouble();
        c.display(r);
        s.display(r);
        sc.close();
    }
}