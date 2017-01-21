package inheritance;

public class Dog extends Animal {

	public Dog() {
		super(15);
		System.out.println("A Dog has been Created !");
	}

	public void ruff() {
		System.out.println("Dog says Ruff !");
	}

	public void run() {
		System.out.println("Dog is running !");
	}
}
