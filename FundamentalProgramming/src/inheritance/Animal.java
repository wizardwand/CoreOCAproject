package inheritance;

public class Animal {

	public int age; // VS private int age 

	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created !!");
	}

	public void eat() {
		System.out.println("An animal is Eatting !");
	}

	public static void main(String[] args) {
		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();

		d.ruff();
		System.out.println(d.age);
		c.meow();
		System.out.println(c.age);
		
		

		a.eat();
		d.eat();
		c.eat();

		d.run();
		c.pramce();
		
		
		
		//What Happens if?
		Animal as = new Dog();
		//Super class can be generalised 
		//Sub claSS cannot be generalised
	}
}
