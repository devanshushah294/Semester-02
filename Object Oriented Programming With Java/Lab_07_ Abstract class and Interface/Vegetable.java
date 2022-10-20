public class Vegetable{
    String color;
}
class Potato extends Vegetable{
    public String toString(){
        color = "skin color";
        return "potato -->"+color;
    }
}
class Brinjal extends Vegetable{
    public String toString(){
        color = "purple";
        return "brinjal-->"+color;
    }

}
class Tomato extends Vegetable{
    public String toString(){
        color = "red";
        return "tomaato -->"+color;
    }

}
