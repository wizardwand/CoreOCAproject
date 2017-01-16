package aa1Variables;

/**
 * Created by patimshi on 12/2/2016.
 */
public class BoxingUnboxing {
    public static void main(String [] s){
        int i = 100 ;
        //
        long l = i ;

        // Auto Boxing is :
        Integer intObj = i ;
        // Prints value in object
        System.out.println(intObj);

        //Unboxing
        int x = intObj.intValue();
        System.out.println(x);
        BoxingUnboxing obj = new BoxingUnboxing();

        // prints the HASH CODE
        System.out.println(obj);
    }
}
