import java.util.Scanner;
public class constructorDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String str = input.nextLine();
        
        System.out.println("your string is = ");
        int i = str.length()/2;
        System.out.println("your string is = "+str.substring(i));
    }
}