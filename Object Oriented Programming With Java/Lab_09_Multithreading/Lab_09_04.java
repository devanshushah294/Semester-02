/*
It is required to have total two threads, both capable of acting as a 
produce as well as a consumer. If first thread acts as a producer then, the 
second thread becomes the consumer and vice-versa. They 
communicate with each other through a buffer, storing one integer 
number. One of the threads initiates the communication by sending 1 to 
the other thread. The second thread, on receiving 1 sends 2 to the first 
thread. On receiving 2, the first thread sends three integer numbers, one 
by one to the second thread. The second thread consumes the numbers 
by displaying them. Both threads terminate after that. Note that both 
threads must be capable of initiating the communication. Write 
complete multi-threaded program to meet above requirements.
*/class Main{
    static int stock = 0;
    public void printStock(){
        System.out.println("stock"+"="+stock);
    }
}
class Produce extends Main implements Runnable{
    public void run(){
            this.produce();
    }
    public void produce(){
        try{
            while(true){
                if(stock>=0 && stock<=5){
                    stock++;
                    this.printStock();
                }else{
                    Thread.sleep(1000);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Consume extends Main implements Runnable{
    public void run(){
            this.consume();
            // this.printStock();
    }
    public void consume(){
        try{
            while(true){
                  if(stock>0){
                      stock--;
                      this.printStock();
                  }
                  else{
                    Thread.sleep(800);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
public class Lab_09_04 {
    public static void main(String[] args) {
        Produce p1 = new Produce();
        Consume c1 = new Consume();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
    }
    
}