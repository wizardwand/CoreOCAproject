package loops;

public class PracticeLoops {

	public static void whileLoop() {
		int x = 0;
		while (x < 1) {
			System.out.println("The value of x is : " + x);
			// x = x+1 ;
			x++;
			// x +=1;
		}
	}

	public static void doWhileLoop() {
		int x = 0;
		do {
			System.out.println("The value of x is : " + x);
			x++;
		} while (x < 2);
	}
	
	public static void forLoop(){
		for(int x = 0 ; x < 10 ; x++){
			System.out.println("The value of x is : "+x);
			if(x == 5 ){
				break;
			}
		}
		
		
		for(int i = 0 ; i < 10 ; i ++){
			for (int j = 0; j < 10; j++) {
				System.out.println("{"+i+" , "+j+"}");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("-----------While Loop Start----------");
		whileLoop();
		System.out.println("-----------While Loop End  ----------");
		System.out.println("-----------Do While Loop Start----------");
		doWhileLoop();
		System.out.println("-----------Do While Loop End  ----------");
		System.out.println("-----------For Loop Start----------");
		forLoop();
		System.out.println("-----------For Loop End  ----------");
	}

}
