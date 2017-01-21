package shnux.interview;

public class Child extends Parent{
	public void display(){
		System.out.println("Child  public display void ");
	}
	@SuppressWarnings("unused")
	private void display1(){
		System.out.println("Child private display void ");
	}
	static void display2(){
		System.out.println("Child static display void ");
	}
	
	public void display(int a ){
		System.out.println("Overidding in child with same signature");
	}
	
	public void display(String sh ){
		System.out.println("Overidding in child with diff signature");
		//return 0;
	}
	
	public void add(){
		System.out.println("add has to be public as parent , cant down size the access compiler error other wise");
	}
	
	protected void sum(){
		System.out.println("sum");
	}
}
