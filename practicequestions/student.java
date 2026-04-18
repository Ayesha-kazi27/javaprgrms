import java.util.*;

public class student {
    int rollno;
    String name;
    student(){
        rollno = 1;
        name = "ayesha";
    }
    student(int rn){
        rollno = rn;
        name = "yashika";
    }
    student(int rn,String n){
        rollno = rn;
        name = n;
    }
    void display(){
        System.out.println("Student name "+name);
        System.out.println("Roll no "+rollno);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
        student s2 = new student(5);
        s2.display();
        student s3 = new student(2,"lol");
        s3.display();
    }
}