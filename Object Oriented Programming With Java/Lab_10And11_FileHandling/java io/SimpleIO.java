// Java code to illustrate standard
// input output streams

import java.io.*;
public class SimpleIO {

	public static void main(String args[])
		throws IOException
	{

		// InputStreamReader class to read input
		InputStreamReader inp = null;

		// Storing the input in inp
		inp = new InputStreamReader(System.in);

		System.out.println("Enter characters, "
						+ " and '0' to quit.");
		char c;
		do {
			c = (char)inp.read();
			System.out.println(c);
		} while (c != '0');

		//to print the ascii values of the characters we need to type cast into int as follows
		// int d;
		// do {
		// 	d = (int)inp.read();
		// 	System.out.println(d);
		// }while (d != '0');
		
		// byte e;
		// do {
		// 	e = (byte)inp.read();
		// 	System.out.println(e);
		// }while (e != 0);
	}
}
