package vectorsnstrings;
import java.util.*;
class Vector1
{
    public static void main(String args[])
    {
        Vector<String> Student= new Vector<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("ENTER \n 1 FOR ADDING STUDENT NAME \n 2 FOR REMOVING STUDENT NAME \n 3 FOR SEACHING STUDENT NAME \n 4 FOR DISPLAYING ALL STUDENT NAMES \n 5 TO EXIT PROGRAM");
        System.out.println();
        int op=sc.nextInt(); sc.nextLine(); 
        switch(op)
        {
            case 1:
            {
            System.out.println("Enter Student Name to add : ");
            String str=sc.nextLine();
            Student.add(str);
            break;
            }
            case 2:
            {
            System.out.println("Enter Student Name to remove : ");
            String rem=sc.nextLine();
            if(Student.contains(rem)==true)
            {
                Student.remove(Student.indexOf(rem));
            }
            else
            { 
                System.out.println("Student Name doesnt exist \n ");  
            }
                break;
            }
            case 3:
            {
            System.out.println("Enter Student Name to search : ");
            String str1=sc.nextLine();
            if(Student.contains(str1)==true)
            {
                System.out.println("Student Name exist \n");
            }
            else
            {
                System.out.println("Student Name doesnt exist \n");
            }
                break;
            }
            case 4:
            {
            System.out.println("Displaying all Students Names \n");
            System.out.println(Student);
            break;
            }
            case 5:
            {
            System.out.println("Program Closed \n ");
            System.exit(0);
            break;
            }
            default: System.out.println("INVALID OPTION!!!!! \n ");
        }
    }
}
}