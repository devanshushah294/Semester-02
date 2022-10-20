//class Runnable1 implements Runnable{

//}
class Runnable2 implements Runnable{
    public void run(){
        for(;;){
            System.out.println("Good Afternoon");
            try{
                Thread.currentThread().sleep(3000);
            }
            catch(Exception e){

            }
        }
    }
}
public class TestMultiThread{
    public static void main(String [] args){
        Runnable2 r2=new Runnable2();
        Thread t1=new Thread(r2);
        t1.start();
    }
}