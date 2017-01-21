package string;

public class StrinFormating {
	public static void main(String[] args) {
		String s = "orgStatus,###iloveyou";
		String[] ss = s.split(",###");
		for(String s1 : ss){
			System.out.println(s1);
		}
		
		System.out.println("Comment to set is : "+ ss[1]);
		
		String check = "Valmistelu 1 ";
		if("Valmistelu".indexOf(check) != -1 ){
			System.out.println("it contains ");
		}else{
			System.out.println("doent have "+check+" in it");
		}
		
		if(check.indexOf("Valmistelu") != -1 ){
			System.out.println("it contains ");
		}else{
			System.out.println("doent have "+check+" in it");
		}		
		
	}
}
