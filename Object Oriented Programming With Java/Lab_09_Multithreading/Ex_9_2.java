// Write a program to create two threads, one thread will print odd 
// numbers and second thread will print even numbers between 1 to 20 
// numbers.
class OddPrint implements Runnable{
    
    public void run(){
        for(int i=1;i<=20;i+=2){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(Exception e1){
                
            }
        }
    }
}
class EvenPrint implements Runnable{
    public void run(){
        for(int j=2;j<=20;j+=2){
            try{
                Thread.sleep(500);
                
                    System.out.println(j);
                }
            catch(Exception e2){
            
            
        }
    }
    }

public class Program_02{
    public static void main(String[] args) {
        OddPrint p1 = new OddPrint();
        EvenPrint p2 = new EvenPrint();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();

    }
}