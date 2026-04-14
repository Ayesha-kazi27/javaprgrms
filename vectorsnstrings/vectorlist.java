//Write a Java program using a Vector to add items to a shopping list and display all the items.
import java.util.*;
public class vectorlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> shoppinglist = new Vector<>();
        while (true){
            System.out.println("Enter your choice \n 1. to add elements \n 2. to display elements \n 3.Quit ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add ");
                    String element = sc.next();
                    shoppinglist.addElement(element);
                    break;
                case 2:
                    System.out.println("Elements of shopping list are : "+ shoppinglist);
                    break;
                case 3: 
                return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}