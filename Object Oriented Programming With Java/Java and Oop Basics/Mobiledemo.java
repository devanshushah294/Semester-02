import java.util.Scanner;

class Mobile{
    int price;
    String name;
    
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of Mobile = ");
        price = sc.nextInt();
        System.out.println("Enter Company name = ");
        name = sc.next();
    }

    void displaydata(){
        System.out.println("Price = "+ price);
        System.out.println("Company name = "+ name);
    }
}
 class Mobiledemo{
     public static void main(String[] args) {
         Mobile m1 = new Mobile();
         Mobile m2 = new Mobile();
         m1.getdata();
         m1.displaydata();
         System.out.println("====================");
         m2.getdata();
         m2.displaydata();
     }
 }
