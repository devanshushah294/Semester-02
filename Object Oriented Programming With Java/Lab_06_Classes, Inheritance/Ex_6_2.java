// Declare a class called book having author_name as private data member. 
// Extend book class to have two sub classes called book_publication & 
// paper_publication. Each of these classes have private member called 
// title. Write a complete program to show usage of dynamic method 
// dispatch (dynamic polymorphism) to display book or paper publications 
// of given author.Use command line arguments for inputting data.
import java.util.Scanner;
class book{
     private String author_name;
     book(String author_name){
         this.author_name = author_name;
     }
     void display(){
         System.out.println(author_name);
     }
}
class book_publication extends book{
    private String title;
    book_publication(String title){
        super("");
        this.title = title;
    }
    void display(){
        System.out.println(title);
    }
}
class paper_publication extends book{
    private String title;
    paper_publication(String title){
        super("");
        this.title = title;
    }
    void display(){
        System.out.println(title);
    }

}
public class Ex_6_2{
    public static void main(String[] args) {
        book b1 = new book_publication("C-programing");
        b1.display();
        book b2 = new paper_publication("Java");
        b2.display();


    }
}

