import java.util.Scanner;
public class Pattern3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for (int j = n;j>0 ; j--){	
			for(int i = j ;i>0 ; i--){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}