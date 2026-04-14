//WAP to find the largest of three integers accepted from the command line.
import java.util.*;
public class largethreecmd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = a>b?a:b;
        max = max>c?max:c;
        System.out.println("The greatest is "+max);
        sc.close();
    }
}
//javac largethreecmd.java
//java largethreecmd 1 2 3