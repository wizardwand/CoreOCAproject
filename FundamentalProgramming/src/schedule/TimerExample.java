package schedule;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample extends TimerTask{
	public void run() {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		// And From your main() method or any other method
		Timer timer = new Timer();
		timer.schedule(new TimerExample(), 0, 1000);
	}
}
