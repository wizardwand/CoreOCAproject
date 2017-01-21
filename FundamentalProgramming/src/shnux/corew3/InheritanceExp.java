package shnux.corew3;

class P {
	void intp() throws ShExp{
		System.out.println("No param PARENT ");
		//throw new ShExp();
		
	}
	// the bellow is the over loading , static , compile time polo
	void intp(int i ){
		System.out.println("intp with param");
	}
	//bellow gives me compilation error
	/*int intp(){
		System.out.println("no Param , but sign change");
		return 0;
	}*/
}
class C extends P {
	void intp(){
		//super.intp();
		System.out.println("i am child no param");
	}
	void cNeewF(){
		// call the parent function 
		//super.intp();
		System.out.println("child new fun ");
	}
	void intp(int j){
		System.out.println("");
	}
	int intp(int i , int j ){
		
		System.out.println("override for P and overload for C");
		return 0 ;
	}
}
public class InheritanceExp {

	public static void main(String[] args){
		P  p = new  P();
		try {
			p.intp();
		} catch (ShExp e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.intp(0);
		
		C c = new C();
		c.intp();
		c.intp(0);
		c.cNeewF();
		
		P pholdscObj = new C();
		try {
			pholdscObj.intp();
		} catch (ShExp e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pholdscObj.intp(0);
		//not getting my overloaded method
		//bellow is not applicable
		//pholdscObj.intp(0,0);
		
		//the bellow code gives us the 
		//java.lang.ClassCastException: shnux.corew3.P cannot be cast to shnux.corew3.C
		//C childHoldsP = (C) new P();
		//childHoldsP.intp();
	}

}
class ShExp extends Exception{
	@Override
	public String toString() {
		return "Shnux custom Exception";
	}
}
