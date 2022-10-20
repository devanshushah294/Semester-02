//Write an application that searches through its command-line argument. If an argument is found that does not begin with and upper case letter, display error message and terminate.
public class Program5{
	public static void main(String[] args) {
		String c1 = args[1].charAt(0);
		String c2 = c1.toUpperCase();
		if(args[1].charAt(0)!=c2.charAt(0)){
			System.out.println("Enter the correct string");	
			break;
		}
		else{
			System.out.println("You have entered the correct string");
		}

	}
}