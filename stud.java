//Assign and print the roll number, phone number and address of two students having names
//"Sam" and "John" respectively by creating two objects of class 'Student'
import java.util.*;
public class stud {
    String name;
    int rollno ;
    String address;
    long phonenumber;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stud stu=new stud("Sam",1,"noida",123456789l);

        sc.close();
    }
}