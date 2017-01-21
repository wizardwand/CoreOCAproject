package shnux.corew3.exp;

class EXp extends Throwable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		System.out.println("Your throwing Throwable !!!!!!");
		return null;
	}
}

public class CustomExp {
	public static void main(String[] args) {
		try{
			throw new EXp();
		}catch(EXp d){
			d.toString();
		}catch (Exception e) {

		}
	}
}
