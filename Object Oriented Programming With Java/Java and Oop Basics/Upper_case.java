import java.util.Scanner;
public class Upper_case
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string : ");
        String ch = input.nextLine();

       for(int i=0;i< ch.length();i++)
       {
           if (ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z')
           {
               System.out.println("character is capital its not valid");
               break;
           }


       }
    }
}