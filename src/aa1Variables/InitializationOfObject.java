package aa1Variables;

/**
 * Created by patimshi on 12/4/2016.
 */

class  Father{
    protected String hairColor = init();
    private int age = 100;

    private String init(){
        System.out.println("Father init");
        return this.hairColor = "Brown";
    }

    @Override
    public String toString() {
        return "Father's hair color: "+hairColor;
    }
}


class Son extends Father {
    {
        System.out.println("Son's init!");
        hairColor = "Orange";
    }
    @Override
    public String toString() {
        System.out.println();
        return "Son's hair color: "+hairColor;
    }
}
public class InitializationOfObject {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son);
        System.out.println("-----");
        Father father = new Father();
        System.out.println(father);
        System.out.println("-----");
        Father fatherHoldSon = new Son();
        System.out.println(fatherHoldSon);
    }
}
