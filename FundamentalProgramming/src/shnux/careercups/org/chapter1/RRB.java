package shnux.careercups.org.chapter1;

public class RRB {

	static char[] p = {'a','b','c','d','e'};
	static char[] s = {'x','y'};
	static int ps = p.length , ss = s.length ; 
	static char[][] c2d ;
	//static int[] set;
	public static void main(String[] args) {
		System.out.println("Product size: "+ps+" Staff Size : "+ss);
		create2D();
		//createSet();
		for(int i = 0 ; i < ps ; i++){
			//getAdded(i);
			//for(int j = 0 ; j < set.length ; j++){
			for(int j = 0 ; j < ss ; j++){
				if(j == i%ss){
					if(i == 0 && j == 0) {
						c2d[0][1]= p[i];
					}else{
						c2d[j][i] = p[i];
					}
				}
			}
		}
		printArray();
	}
	
	/*private static void getAdded(int value) {
		for(int i = 0 ; i < set.length ; i++){
			if(i == value%ss){
				c2d[i][value] = p[value];
			}
		}
	}*/

	/*private static void createSet() {
		set = new int[ss];
		for(int i = 0 ; i < ss ; i++){
			set[i] = i ;
		}
	}*/

	private static void printArray() {
		for(int i = 0 ; i < ss   ; i++){
			System.out.println();
			for(int j = 0 ; j < ps ; j++){
				System.out.print(" "+c2d[i][j]);
			}
		}
	}

	private static void create2D() {
		c2d = new char [ss][ps];
		for(int i = 0 ; i < ss  ; i++){
			c2d[i][0] = s[i];
		}
	}
}
