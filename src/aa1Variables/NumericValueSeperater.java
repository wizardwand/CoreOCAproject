package aa1Variables;

import java.util.Locale;

/**
 * Created by patimshi on 11/29/2016.
 */
public class NumericValueSeperater {
    public static void main(String[] shirish){
        long creditCardNumber = 1234_5678_9012_3456L;
        System.out.println("creditCardNumber :"+creditCardNumber);
       /* String s = "1234_5678_9012_3456L";
        long convertedCardNumber = Long.parseLong(s);
        System.out.println("Converted credit card no: "+ convertedCardNumber);*/
        // Invalid: cannot put underscores
        // adjacent to a decimal point
            //float pi1 = 3_.1415F;
        // Invalid: cannot put underscores
        // adjacent to a decimal point
              //  float pi2 = 3._1415F;
        // Invalid: cannot put underscores
        // prior to an L suffix
             //   long socialSecurityNumber1 = 999_99_9999_L;

        // OK (decimal literal)
                int x1 = 5_2;
        // Invalid: cannot put underscores
        // At the end of a literal
               // int x2 = 52_;
        // OK (decimal literal)
                int x3 = 5_______2;

        // Invalid: cannot put underscores
        // in the 0x radix prefix
                //int x4 = 0_x52;
        // Invalid: cannot put underscores
        // at the beginning of a number
                //int x5 = 0x_52;
        // OK (hexadecimal literal)
                int x6 = 0x5_2;
        // Invalid: cannot put underscores
        // at the end of a number
                //int x7 = 0x52_;
    }
}
