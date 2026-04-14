//Write a Java program to count the number of vowels, consonants, and blank spaces in a given string.
import java.util.*;
public class countvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to find its length");
        String s = sc.nextLine();
        int countvowels = 0;
        int countblank = 0;
        int countconsonents = 0;
        for(int i =0;i<s.length();i++){
            int ch = s.charAt(i);
            if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'){
                countvowels++;
            }else{
                countconsonents++;
            }
            if(ch ==' '){
                countblank++;
            }
        }
        System.out.println("The number of vowels in this string are : "+countvowels);
        System.out.println("The number of blank spaces in this string are : "+countblank);
        System.out.println("The number of consonents in this string are : "+countconsonents);
        sc.close();
    }
}