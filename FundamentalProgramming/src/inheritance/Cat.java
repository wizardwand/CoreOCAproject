package inheritance;

public class Cat extends Animal {

	public Cat() {
		super(10);
		System.out.println("a Cat has been created !");
	}

	public void meow() {
		System.out.println("A Cat meows !");
	}

	public void pramce() {
		System.out.println("A cat is parmcing");
	}
}
