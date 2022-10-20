import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer str2 = new StringBuffer(str);
        str2.reverse();
        if(str2.toString().equals(str)){
            System.out.println("The given String is palindrome");
        }else{
            System.out.println("The given String is not palindrome");
        }
    }
}
