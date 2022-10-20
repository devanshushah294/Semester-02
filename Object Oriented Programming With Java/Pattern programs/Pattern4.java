import java.util.Scanner;
public class Pattern4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for(int j = 0 ;j<n; j++){
			for(int k=n-j-1;k>0;k--){
				System.out.print("  ");
				}
			for(int i = 0 ; i<j+1 ;i++){
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}