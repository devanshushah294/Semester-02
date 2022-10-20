// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
	// public void run()
	// {
	// 	System.out.println("Hello world");
	// }
}

// Main Class
public class MultiThread {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
			System.out.println(object.getId());
			
		}
	}
}
