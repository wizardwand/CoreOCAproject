package aa3Operands;

/**
 * Created by patimshi on 12/2/2016.
 */
public class Divide {
    public final static void main(String[] args){
        //divide by -0 OR 0 will always result in the positive infinity
        double d = 10.0 / -0;
        if(d == Double.POSITIVE_INFINITY)
            System.out.println("Positive infinity");
        else
            System.out.println("Negative infinity");
    }
}
