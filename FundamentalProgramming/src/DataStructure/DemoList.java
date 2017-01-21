package DataStructure;

import java.util.Arrays;

public class DemoList {

	public static void main(String[] args) {
		MyList l = new MyList();
		System.out.println(Arrays.toString(l.arr));
		l.insert(0);
		l.insert(1);
		l.insert(2);
		l.insert(3);l.insert(4);l.insert(5);
		
		System.out.println(Arrays.toString(l.arr));
		l.insert(6);l.insert(7);l.insert(8);l.insert(9);l.insert(10);l.insert(11);l.insert(12);
		System.out.println(Arrays.toString(l.arr));
		l.insert(0 , 11);
		l.insert(0 , 100);
		l.insert(0 , 101);
		l.insert(100 , 1000);
		l.insert(100 , 1000);
		l.insert(100 , 1000);
		l.insert(100 , 1000);
		l.insert(100 , 1000);
		System.out.println(Arrays.toString(l.arr));
	}

}
