package shnux.corew3;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThreadExtThread tT = new MyThreadExtThread();
		tT.run();
		tT.run();
		tT.run();
		
		
		MyThreadImplRunabble tR = new MyThreadImplRunabble();
		Thread ttR = new Thread(tR);
		ttR.start();
		
		Thread ttR2 = new Thread(tR);
		ttR2.start();
		
		Thread ttR3 = new Thread(tR);
		ttR3.start();
		
		Thread ttR4 = new Thread(tR);
		ttR4.start();
		
	}
}

class MyThreadExtThread extends Thread {
	public void run() {
		System.out.println("Important job running in MyThreadExtThread");
	}
}

class MyThreadImplRunabble implements Runnable {

	@Override
	public void run() {
		System.out.println("Important job running in MyThreadImplRunabble");
	}

}
