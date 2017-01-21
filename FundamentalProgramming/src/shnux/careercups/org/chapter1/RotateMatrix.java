package shnux.careercups.org.chapter1;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] charArr= {{'a','b'},{'c','d'}};
		rotate2Nby90(charArr);
	}

	private static void rotate2Nby90(char[][] charArr) {
		int x=0,y = 0;
		int matrixOfSize = charArr.length;
		//System.out.println(matrixOfSize);
		for(int i =0 ; i < 1 ; i++){
			char first00 = charArr[i][i];
			char first01 = charArr[i][i+1];
			char second10 = charArr[i+1][i];
			char second11 = charArr[i+1][i+1];
		}
	}

}
