// The Transport interface declares a deliver () method. The abstract class 
// Animal is the super class of the Tiger, Camel, Deer and Donkey classes. 
// The Transport interface is implemented by the Camel and Donkey 
// classes. Write a test program that initialize an array of four Animal 
// objects. If the object implements the Transport interface, the deliver () 
// method is invoked.
import java.util.Scanner;
interface Transport{
    void deliver();
}
abstract class Animal{
    
}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
     public void deliver(){
         System.out.println("Animal is camel");
     }
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Animal is Donkey");
    }
}
public class Ex_7_3{
    public static void main(String[] args) {
        Animal name[] = new Animal[4];
        for( int i=0;i<4;i++){
             name[i] = new Animal();
        }

    }
}

