abstract class shape{
    abstract void displayarea(int r);
    abstract void displayarea(int a,int b);
    
}
class circle extends shape{
     void displayarea(int r){
        System.out.println("Area of circle = " + (r*r));
    }
     void displayarea(int a,int b){}
}
class triangle extends shape{
    public void displayarea(int a,int b){
        System.out.println("Area of Triangle = " + (0.5*a*b));
    }
     void displayarea(int r){}
}
public class AreaDemo{
    public static void main(String[] args) {
        shape s;
        s = new circle();
        s.displayarea(5);
        s = new triangle();
        s.displayarea(6, 6);
    }
}