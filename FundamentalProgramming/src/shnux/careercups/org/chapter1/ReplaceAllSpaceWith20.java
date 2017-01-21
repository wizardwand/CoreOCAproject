package shnux.careercups.org.chapter1;

public class ReplaceAllSpaceWith20 {

	public static void main(String[] args) {
		ReplaceAllSpaceWith20 cp = new ReplaceAllSpaceWith20();
		String s1 = "mr Albus serves world peace    ";
		String s2 = "";
		cp.replaceIt(s1);
		
	}

	public String replaceIt(String s1) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s1.trim());
		
		do{
			
			int index = sb.indexOf(" "); 
			sb.replace(index, index+1, "'%20");
			//System.out.println(":->"+sb.charAt(index)+"<--");
			sb.replace(index, index + 1, "");
		}while(sb.indexOf(" ") != -1);
		System.out.println(sb);
		return null;
	}

}
