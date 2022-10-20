// Java Program illustrating the
// Byte Stream to copy
// contents of one file to another file.
import java.io.*;
public class BStream {
	public static void main(String[] args) 
	throws IOException
	{

		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try {
			sourceStream = new FileInputStream("sourceFile.txt");
			targetStream = new FileOutputStream("targetfile.txt");

			// Reading source file and writing
			// content to target file byte by byte
			int temp;
			while ((temp = sourceStream.read())!= -1){
				targetStream.write((int)temp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
		}
	}
}
