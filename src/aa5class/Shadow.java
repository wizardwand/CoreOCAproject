package aa5class;

/**
 * Created by patimshi on 12/4/2016.
 */
public class Shadow {
    int x,y;

    Shadow(){
        //Explicit constructor invocation professional
        this(1 , 1);
        System.out.println();
    }

    Shadow (int x , int y ){
        x = x ;
        this.y = y ;
    }
    public final static void main(String[] args){
        Shadow s = new Shadow(10, 11);
        System.out.println(s.x);
        System.out.println(s.y);
    }
}
