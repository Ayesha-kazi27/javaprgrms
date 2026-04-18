import java.util.*;

public class vect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <String> names = new Vector<>();
        while(true){
            System.out.println("Enter choice \n1. Add Student \n2. Remove Student \n3. Search student by index  number \n4. Display all Students \n5. Exit");
            int ch = sc.nextInt();
            String name;
            int index;
            switch (ch) {
                case 1:
                    System.out.println("Enter the name of student to be added");
                    name = sc.next();
                    names.add(name);
                    System.out.println("Name added succesfully!!");
                    break;
                case 2:
                    System.out.println("Enter the name of student to be removed");
                    name = sc.next();
                    if (names.remove(name)){
                        System.out.println("Name removed successfully");
                    }else {
                        System.out.println("Name not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter index: ");
                    index = sc.nextInt();
                    if (index >=0 && index <names.size()){
                        System.out.println("Student at index "+index + " is "+names.get(index));
                    }else{
                        System.out.println("invalid index");
                    }
                    break;
                case 4:
                    System.out.println("Students are : ");
                    for(String s:names){
                        System.out.println(s);
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}