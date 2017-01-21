package practice;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class tets {
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.####");
		int i = 2, j =6;
		double ii = i , jj = j ;
		double dd = ii/jj;
		System.out.println(df.format(dd));// the return type of this function is
		
		double d = 2.12344556;
		
		System.out.println(df.format(d));// the return type of this function is
											// string
											// Do not use if you wish to perform
											// any //more arthematic opertions
											// on the numbers
	}
}
