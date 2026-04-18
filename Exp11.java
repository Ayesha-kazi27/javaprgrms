public class Exp11 {
    public static void main(String []args)
    {
        Even e1=new Even();
        e1.start();

        Odd o1=new Odd();
        Thread t1=new Thread(o1);
        t1.start();

    }
}
class Even extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            if (i%2==0)
                System.out.println("Even="+i);
        }
    }
}
class Odd implements Runnable  {
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2!=0){
                System.out.println("Odd="+i);
            }
        }
    }
}