package aa3Operands;

/**
 * Created by patimshi on 12/1/2016.
 */
public class OperatorPrecedencePUMAS {
    public static void main(String[] args){

        /**
         * PUMAS - Postfix, Unary , Multiplicative, Additive, Shift
         */

        //postfix
        int x = 3 ;
        x++;
        x--;

        //Unary;
        ++x;
        --x;
        x += 10;
        x -= 3;
        System.out.println("x: "+x);
        x = ~x;
        // prints -11
        System.out.println("~x: "+x);
        //checkTheValuesInTilda(10);
        boolean bool = !false ;

        int value = 1 ;
        System.out.println(value + ": Shift >> 1"+ (value >> 1));
        System.out.println(value + ": Shift >> 2"+ (value >> 2));
        System.out.println(value + ": Shift >> 3"+ (value >> 3));

        value = 2 ;
        System.out.println(value + ": Shift >> 1"+ (value >> 1));
        System.out.println(value + ": Shift >> 2"+ (value >> 2));
        System.out.println(value + ": Shift >> 3"+ (value >> 3));
    }
    public static void checkTheValuesInTilda(int v) {
        //      prints
        //        0: tilda value: -1
        //        1: tilda value: -2
        //        2: tilda value: -3
        //        3: tilda value: -4
        //        4: tilda value: -5
        //        5: tilda value: -6
        //        6: tilda value: -7
        //        7: tilda value: -8
        //        8: tilda value: -9
        //        9: tilda value: -10
        for(int i = 0 ; i < v ; i++){
            System.out.println(i+": tilda value: "+~i);
        }
    }

}
