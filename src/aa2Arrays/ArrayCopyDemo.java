package aa2Arrays;

/**
 * Created by patimshi on 11/29/2016.
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        copyTo = new char[7];
        System.arraycopy(copyFrom,0,copyTo,0,2);
        //if The length goes above the available indexes the ArrayIndexOutOfBound Exception is thrown.
        System.arraycopy(copyFrom,9,copyTo,2,4);
        System.out.println("array : "+ new String(copyTo));

        copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));
    }
}
