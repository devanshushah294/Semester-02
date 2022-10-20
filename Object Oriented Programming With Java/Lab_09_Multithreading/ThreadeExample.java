/*
It is required to have total two threads, both capable of acting as a 
produce as well as a consumer. If first thread acts as a producer then, the 
second thread becomes the consumer and vice-versa. They 
communicate with each other through a buffer, storing one integer 
number. One of the threads initiates the communication by sending 1 to 
the other thread. The second thread, on receiving 1 sends 2 to the first 
thread. On receiving 2, the first thread sends three integer numbers, one 
by one to the second thread. The second thread consumes the numbers 
by displaying them. Both threads terminate after that. Note that both 
threads must be capable of initiating the communication. Write 
complete multi-threaded program to meet above requirements.
*/
// Java program to implement solution of producer
// consumer problem.

import java.util.LinkedList;

public class ThreadExample {
	public static void main(String[] args)
		throws InterruptedException
	{
		// Object of a class that has both produce()
		// and consume() methods
		final PC pc = new PC();

		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// This class has a list, producer (adds items to list
	// and consumer (removes items).
	public static class PC {

		// Create a list shared by producer and consumer
		// Size of list is 2.
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		// Function called by producer thread
		public void produce() throws InterruptedException
		{
			int value = 0;
			while (true) {
				synchronized (this)
				{
					// producer thread waits while list
					// is full
					while (list.size() == capacity)
						wait();

					System.out.println("Producer produced-"
									+ value);

					// to insert the jobs in the list
					list.add(value++);

					// notifies the consumer thread that
					// now it can start consuming
					notify();

					// makes the working of program easier
					// to understand
					Thread.sleep(1000);
				}
			}
		}

		// Function called by consumer thread
		public void consume() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{
					// consumer thread waits while list
					// is empty
					while (list.size() == 0)
						wait();

					// to retrieve the first job in the list
					int val = list.removeFirst();

					System.out.println("Consumer consumed-"
									+ val);

					// Wake up producer thread
					notify();

					// and sleep
					Thread.sleep(1000);
				}
			}
		}
	}
}
