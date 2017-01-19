package chapter1;

/**
 * Created by patimshi on 1/16/2017.
 */
public class C01_AllUniqueCharacter {

    public static void main(String[] a ){
        String strWithAllUniqueCharacter = "abcdefghijklmnopqrstuvwxyz123456789";
        System.out.println("is string "+strWithAllUniqueCharacter+" unique "+ isStringUnique(strWithAllUniqueCharacter));
    }

    private static boolean isStringUnique(String str) {
        boolean isUnique = true;
        for(int i = 0 ; i < str.length() ; i ++ ){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                continue;
            }else{
                return false;
            }
        }
        return isUnique;
    }


}
