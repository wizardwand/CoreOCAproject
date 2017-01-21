package shnux.corew3.thread;

public class TestMyRunnable {

	public static void main (String [] args) throws InterruptedException {

	MyRunnable myrunnable = new MyRunnable();

	//Passing myrunnable object to Thread class constructor

	Thread t1 = new Thread(myrunnable);

	t1.setName("Shnux-1 Thread");

	//Starting Thread t1

	t1.start();
	//if called more then 1 java.lang.IllegalThreadStateException
	//t1.start();

	t1.sleep(200);
	t1.stop();

	Thread t2 = new Thread(myrunnable);

	t2.setName("Shnux-2 Thread");

	t2.start();
	
	}
}
class MyRunnable implements Runnable{

	@Override

	public void run() {

		for(int x =1; x < 10; x++) {

			System.out.println("MyRunnable running for Thread Name: " + Thread.currentThread().getName() + " Time"
					+ System.currentTimeMillis());

			}

	}

}


