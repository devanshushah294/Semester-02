/*Write an application that executes two threads. One thread displays 
"Good Morning" every 1000 milliseconds & another thread displays 
"Good Afternoon" every 3000 mill*/
class GoodMorning implements Runnable{
    public void run(){
        for(;;){
            try{
                Thread.sleep(1000);
                System.out.println("Good Morning");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class GoodAfternoon implements Runnable{
    public void run(){
        for(;;){
            try{
                Thread.sleep(3000);
                System.out.println("Good Afternoon");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Program_01{
    public static void main(String[] args) {
        GoodMorning o1 = new GoodMorning();
        GoodAfternoon o2 = new GoodAfternoon();
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        t2.start();
    }
}