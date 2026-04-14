public class Student {
    int rollno;
    String name;

    Student() {
        rollno = 5;              
        name = "Raj";            
        System.out.println("Default constructor called");
    }

    
    Student(int rn) {
        rollno = rn;
        name = "Varun";
        System.out.println("Parameterized constructor with one argument called");
    }

    
    Student(int rn, String n) {
        rollno = rn;
        name = n;
        System.out.println("Parameterized constructor with two arguments called");
    }

    
    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Roll number: " + rollno);
    }

    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();

        
        Student s2 = new Student(10);
        s2.display();

        
        Student s3 = new Student(20, "Amit");
        s3.display();
    }
}