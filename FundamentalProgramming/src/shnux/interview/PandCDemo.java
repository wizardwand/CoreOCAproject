package shnux.interview;


class Vehicle {
	public void wheels() {
		System.out.println("Vehicle wheels riginal");
	}
}

class Cars extends Vehicle {
	public void wheels() {
		System.out.println("CArs have 4 wheels");
	}
}

public class PandCDemo {

	public void testWheels() {
		Cars c = new Cars();
		c.wheels();
	}

}
