package shnux.careercups.org.chapter1;

public class RemoveDuplicateCharacters {
	public String removeDubFromStr(String s){
		char [] c = s.toCharArray();
		for(int i = 0 ; i < s.length() ; i++){
			int lastInd = s.lastIndexOf(c[i]);
			int first = s.indexOf(c[i]) ;
			if(first != lastInd ){
				c[lastInd] = ' ';
			}
		}
		for(char ch : c){
			System.out.print("\t"+ch);
		}
		return c.toString();
	}
}
