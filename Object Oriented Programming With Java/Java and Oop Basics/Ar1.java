import java.util.Scanner;
public class Ar1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] ar = new int[5];
        for(int i=0 ; i< 5 ; i++)
        {
            System.out.println("Enter the value = ");
            ar[i] = sc.nextInt();
        }
        for(int i=0 ; i< 5 ; i++)
        {
            if(ar[i]%2==0){
            System.out.println(ar[i]);
            }
        }
    }
}
