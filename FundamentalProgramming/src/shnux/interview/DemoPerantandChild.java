package shnux.interview;

public class DemoPerantandChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.display();
		//p.display1();
		Parent.display2();
		
		Parent pc = new Child();
		pc.display();
		pc.display2();
	}

}
