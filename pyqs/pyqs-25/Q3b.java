//Write a program to accept number from command line and count number of digits in a user entered number.

public class Q3b {
    public static void main(String[] args) {
        System.out.println("Enter the number to count its digits");
        String s = args[0];
        System.out.println("The number of digits are "+ s.length());
    }
}
// javac file.java 
// java file args