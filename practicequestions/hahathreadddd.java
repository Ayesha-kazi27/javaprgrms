//Create threads such that one thread will print even number and another will print odd number in an ordered fashion
import java.util.*;

class even extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2 == 0)
                System.out.println("Even "+i);
        }
    }
}
class odd extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2 != 0)
                System.out.println("Odd "+i);
        }
    }
}
public class hahathreadddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        even e = new even();
        odd o = new odd();
        e.start();
        o.start();
        sc.close();
    }
}