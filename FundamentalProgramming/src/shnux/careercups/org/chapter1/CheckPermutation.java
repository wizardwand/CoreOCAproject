package shnux.careercups.org.chapter1;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPermutation cp = new CheckPermutation();
		String s1 = "shirish";
		String s2 = "iirshsh";
		boolean isPermutation = cp.isItPermutation(s1, s2);
		System.out.println(s1 + " and " + s2 + " Strings are permutation ? " + isPermutation);
	}

	public boolean isItPermutation(String s1, String s2) {
		char[] stack = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for (int i = stack.length - 1; i > -1; i--) {
			int index = sb.indexOf(stack[i] + "");
			if (index != -1) {
				sb.replace(index, index + 1, "");
			}
		}
		if (sb.length() == 0) {
			return true;
		}
		return false;
	}

}
