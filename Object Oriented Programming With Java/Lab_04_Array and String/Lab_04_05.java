/*
Write an application that searches through its command-line argument. If an argument 
is found that does not begin with and upper case letter, display error message and 
terminate.
*/
public class Lab_04_05{
	public static void main(String[] args) {
		for(int i = 0; true; i++){
			if(args[i].equals('\0')){
				break;
			}
			else{
				if(args[i].charAt(0)>='A' && args[i].charAt(0)<='Z'){
					// for checking that other arguments are running properly 
					// System.out.println(args[i]);
					continue;
				}
				else{
					System.out.println("Sorry,you had given the wrong argument");
					break;
				}
			}
		}
		
	}
}