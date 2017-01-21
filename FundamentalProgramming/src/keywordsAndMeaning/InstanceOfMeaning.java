package keywordsAndMeaning;

import java.util.ArrayList;

public class InstanceOfMeaning {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("Hello");
		a.add(1);
		a.add(1.2f);
		
		for(Object o : a){
			if(o instanceof String ){
				System.out.println("String"+o);
			}else if(o instanceof Float){
				System.out.println("Float"+o);
			}else if(o instanceof Integer){
				System.out.println("Integer"+o);
			}
		}
	}

}
