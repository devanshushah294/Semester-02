// Write an application that executes two threads. One thread displays 
// "Good Morning" every 1000 milliseconds & another thread displays 
// "Good Afternoon" every 3000 milliseconds. Create the threads by 
// implementing the Runnable interface.
class A implements Runnable{
    public void run(){
        System.out.println("Good Morning");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println(" Good Afternoon ");
    }
}
public class Ex_9_1{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        
        try{
            Thread t1 = new Thread(obj1,"child1");
            Thread t2 = new Thread(obj2,"child2");
            t1.start();
            t2.start();
            System.out.println(t1.isAlive());
            System.out.println(t2.isAlive());
        }catch(Exception e){
            Thread.sleep(1000);
            Thread.sleep(3000);
        }
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}