package shnux.interview;

public class Parent {
	public void display() {
		System.out.println("parent  public display void ");
	}

	private void display1() {
		System.out.println("parent private display void ");
	}

	static void display2() {
		System.out.println("parent static display void ");

	}

	public void display(int abc) {
		System.out.println("Overloading/static polimorphisum");
	}

	// overridding bacesd on access specifier

	public void add() {

		System.out.println("addding public objects");
	}
	
	protected void sum()
	{
		System.out.println("defa43t has t6 be defa43t 6r *4b35c");
	}

}
