package shnux.interview;

public class Polymorphism {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.display();
		p.display(0);
		Parent.display2();

		Parent pc = new Child();
		// untill child did not make change it remained static  polymorphism
		// pc.display(0);
		pc.display();

		// now child implements it with 2 parameter
		pc.display(0);
		pc.add();
		// cant call bellow because its not there in parent class ,
		// only child class reference can call it
		// pc.display("shnux");

		// Exception in thread "main" java.lang.ClassCastException:
		// shnux.interview.Parent cannot be cast to shnux.interview.Child
		// Child chRef = (Child) new Parent();
		// chRef.display("shnu");

	}
}
