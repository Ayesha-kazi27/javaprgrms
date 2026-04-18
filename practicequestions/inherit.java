import java.util.*;

public class inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        result r = new result();
        r.accept();
        r.disp();
        sc.close();
    }
}
class student {
    int rollno;
    String name;
}
class Exam extends student{
    double m1,m2,m3;
}
class result extends Exam{
    double total;
    Scanner sc = new Scanner(System.in);
    void accept(){
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter roll no");
        rollno = sc.nextInt();
        System.out.println("Enter marks of 3 subjects");
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
    }
    void disp(){
        total = m1+m2+m3;
        System.out.println("Name "+name);
        System.out.println("Roll no."+rollno);
        System.out.println("Total marks "+total);
    }
}