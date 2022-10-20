import java.util.Scanner;
public class Pattern06{
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
		for (int j = n-1;j>0 ;j--) {
			for (int i = 0 ;i<(n-j)+1 ;i++) {
				System.out.print(" ");
			}
			for (int i = j ; i>0 ; i--) {
				System.out.print("* ");
			}
			for (int i = 0 ;i<(n-j) ;i++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

	}
}