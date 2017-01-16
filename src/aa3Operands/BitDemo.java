package aa3Operands;

/**
 * Created by patimshi on 11/30/2016.
 */
public class BitDemo {
    public static void main(String[] args){
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints bitmask: 15 val: 8738
        System.out.println("bitmask: "+bitmask+" val: "+val);
        // prints "2"
        System.out.println(val & bitmask);
    }
}
