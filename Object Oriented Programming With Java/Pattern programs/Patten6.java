import java.util.Scanner;
public class Patten6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int count=1;
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print((count%2)+" ");
                count++;
            }
            System.out.println("\n");
        }
    }
}
