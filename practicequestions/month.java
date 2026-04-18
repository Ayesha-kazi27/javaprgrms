//Implement java program to accept and display the month number. Throw an exception if an improper month number is entered. Make your own exception class to handle this exception.
import java.util.*;

class  InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}
public class month {
    public static void main(String[] args) throws InvalidMonthException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of month to display its number");
        String n = (sc.next()).toLowerCase();
        switch (n) {
            case "january":
                System.out.println("1");
                break;
            case "february":
                System.out.println("2");
                break;
            default:
                throw new InvalidMonthException("Enter valid month name");
        }
        sc.close();
    }
}
// refer prgm 10 for the exact solution this is just a trial