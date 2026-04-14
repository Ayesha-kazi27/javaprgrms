import java.util.*;
class Student 
{
	int roll_no;
	String name;
}
class Exam extends Student 
{
	double m1, m2, m3;
}
class Result extends Exam 
{
	double total_marks;
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the student name ");
		name = sc.next();
		System.out.println("Enter the Roll no");
		roll_no=sc.nextInt();
		System.out.println("Enter the marks of three subjects");
		m1= sc.nextDouble();
		m2= sc.nextDouble();
		m3= sc.nextDouble();
	}
	void calculate()
	{
		total_marks = m1+m2+m3;
		System.out.println("Name of student= "+name);
		System.out.println("Roll number of student= "+roll_no);
		System.out.println("Total marks in 3 subjects = "+total_marks);
}
}
class epiyushoixp7
{
	public static void main(String args[])
	{
		Result r1 =new Result();
		r1.accept();
		r1.calculate();
	}
}