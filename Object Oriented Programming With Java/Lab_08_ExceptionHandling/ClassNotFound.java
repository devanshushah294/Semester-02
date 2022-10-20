public class ClassNotFound{
	public static void main(String[] args) {
		int number[] = new int[];
			number[21] = 35;
		try{
		System.out.println(number.length);	
		}
		catch(NullPointerException e){
			System.out.println("null pointer exeption");

		}
	}
}