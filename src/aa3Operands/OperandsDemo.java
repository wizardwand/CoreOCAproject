package aa3Operands;

/**
 * Created by patimshi on 11/30/2016.
 */
public class OperandsDemo {
    public static void main(String[] args){
        //PrePostDemo
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);

        int s = 2 ;
        int x =  s++ * s++ * s++;
        // x = 2 * 3 * 4 , s = 5
        // prints 24 s: 5
        System.out.println(x +" s: "+ s);

        int pre = 1 ;
        int res = ++pre * ++pre * ++pre * ++pre ;
        // res = 2 * 3 * 4 * 5 , pre = 5
        // prints 120 pre:5
        System.out.println(res +" pre:"+pre);


        //When using the instanceof operator, keep in mind that null is not an instance of anything.


        //the following code will create a factorial expression
        int factorialOf = 5 ;
        StringBuffer sb = new StringBuffer();
        for(int count = factorialOf ; count > 0 ; count--){
            sb.append("X++*");
        }
        //will delete the last character
        sb.deleteCharAt(sb.length()-1);
        //prints -> X++*X++*X++*X++*X++
        System.out.println(sb);
    }
}
