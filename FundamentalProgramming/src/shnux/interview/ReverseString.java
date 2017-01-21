package shnux.interview;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Shnux111111111";
		String revStr = ReverseString.reverseSr(str);
		System.out.println(ReverseString.isPalendrome(str, revStr));
		
		ReverseString re = new ReverseString();
		re.reverseUsingForLoop("shnux");
	}
	
	private static String reverseSr(String str){
		StringBuffer strBuff = new StringBuffer(str);
		System.out.println("String reverse of"+str+" is "+strBuff.reverse());
		return strBuff.toString();
	}
	
	private static boolean  isPalendrome ( String str , String strRev){
		return str.equalsIgnoreCase(strRev);
	}
	
	public void reverseUsingForLoop(String str){
		/*char[] chr = str.getChars(0, srcEnd, dst, dstBegin);();
		System.out.println(chr.length);
		for(int i = chr.length -1 ; i >0 ; i--){
			System.out.println(chr[i]);
		}*/
		
	}
	
}
