abstract class Vegetable{
    abstract void displaycolour(String colour);
}
class tomato extends Vegetable{
    public void displaycolour(String colour){
        System.out.println("Red");
    }
}
class potato extends Vegetable{
    public void displaycolour(String colour){
        System.out.println("Grey");
    }
}
class brinjal extends Vegetable{
    public void displaycolour(String colour){
        System.out.println("purple");
    }
}
public class VegetableDemo{
    public static void main(String[] args) {
        Vegetable v;
        v = new tomato();
        v.displaycolour("Red");
        v = new potato();
        v.displaycolour("Grey");
        v = new brinjal();
        v.displaycolour("Purple");
    }
}

