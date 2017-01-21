package shnux.interview;

public class EqualOrEqOprUse {

	public static void main(String[] args) {
		String str1 = "shirish";
		String str2 = new String(new char[] { 's', 'h', 'i', 'r', 'i', 's', 'h' });
		String str3 = "shirish";
		if (str1 == str3) {
			System.out.println("Equal oprator works");
		}
		if (str1.equals(str2)) {
			System.out.println("obj Comparasion successful");
		}

		// we should use equals method if we are going to compare objects
		// as well as were we have auto boxing etc

		int intPremitive = 5;
		Integer intObj = new Integer(5);
		if (intPremitive == intObj) {
			System.out.println("Equal oprator works");
		}
		//this has a very big range
		if (intObj.equals(intPremitive)) {
			System.out.println("obj Comparasion successful");
		}
		
		//this has the rangew of -128 to 128

		Integer i1 = 260;
		Integer i2 = 260;

		if (i1 == i2) {
			System.out.println("i1 and i2 is equal");
		}
		if (i1.equals(i2)) {
			System.out.println("i1 and i2 is not equal ");
		}
	}
}
