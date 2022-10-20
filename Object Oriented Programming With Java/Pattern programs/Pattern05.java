import java.util.Scanner;
public class Pattern05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int j=n ;j>0 ;j--) {
			for (int i = 0 ;i<j;i++) {
				System.out.print(" ");
			}
			for (int i = 0;i<(n-j)+1;i++){
				System.out.print("* ");
			}
			for (int i = 0 ;i<j-1;i++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

	}
}