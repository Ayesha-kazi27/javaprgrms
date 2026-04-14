import java.util.Scanner;
import java.util.Vector;
public class StudentTracker {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Vector<String> names = new Vector<>();
while(true){
System.out.println("\nEnter choice :"
+ "\n1. Add Student"
+ "\n2. Remove Student"
+ "\n3. Search Student By Index number"
+ "\n4. Display all Students"
+ "\n5. Exit"
);
int choice = in.nextInt();
in.nextLine();
String name;
int index;
switch(choice){
case 1:
System.out.println("Enter name of student to be added :");
name = in.nextLine();
names.add(name);
System.out.println("Name added successfully");
break;
case 2:
System.out.println("Enter name of student to be removed :");
name = in.nextLine();
if(names.remove(name)){
System.out.println("Name removed successfully");
}
else{
System.out.println("Name not found!");
}
break;
case 3:
System.out.println("Enter index :");
index = in.nextInt();
in.nextLine();
if(index >= 0 && index < names.size()){
System.out.println("Student at index " + index + " is " + names.get(index));
}
else{
System.out.println("Invalid index!");
}
break;
case 4:
System.out.println("Students are :");
for(String i : names){
System.out.println(i);
}
break;
case 5:
in.close();
return;
}
}
}
}