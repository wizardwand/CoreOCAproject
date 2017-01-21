package chapter1;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by patimshi on 1/16/2017.
 */
public class C01_AllUniqueCharacter {

    public static void main(String[] a ){
        String strWithAllUniqueCharacter = "abcdefghijklmnopqrstuvwxyz123456789";
        System.out.println("is string "+strWithAllUniqueCharacter+" unique "+ isStringUnique(strWithAllUniqueCharacter));

        C01_AllUniqueCharacter obj = new C01_AllUniqueCharacter();
        obj.sortCharacterStringV2(new StringBuffer("shirish prakash patil"));
        obj.sortCharacterStringV2(new StringBuffer(strWithAllUniqueCharacter));

        //use hash table to check if unique string
        boolean isIt = obj.isUniqueHashTableImpl("aabcdseaaaa");
        System.out.println("isIt ? "+isIt);

    }

    /**
     * TODO: solution is not working need to investigate
     * @param s string
     */
    public boolean isUniqueHashTableImpl(String s ){
        boolean isUnique = false;
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for(int i = 0 ; i < s.length(); i++){
            String c = ""+s.charAt(i);
            if(!hashtable.contains(c)){
                hashtable.put(c,1);
            }else{
                int newValue = hashtable.get(c)+1;
                System.out.println(newValue);
               hashtable.put(c , newValue);
            }
        }
        System.out.println(hashtable);
        return true;
    }
    /**
     * Using indexof and last indexOf fun of string
     * @param str
     * @return
     */
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

    /**
     * sorted the string using bubble sort.
     * @param s
     */
    public void sortCharacterString(String s){
        System.out.println("string is : " + s );
        char[] a  = s.toCharArray();
        for(int j = 0 ; j < a.length ; j++)
        for(int i = 0 ; i < a.length -1  -j ; i++ ){
            if(a[i] > a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = (char) tmp;
            }
        }
        String stmp = new String(a);
        System.out.println("sorted array : "+ stmp);
    }

    /**
     * sorted using bubble sort , used stringbuffer for swaping to reduce the
     * complexicity of new string being created in string pool
     * @param s
     */
    public void sortCharacterStringV2(StringBuffer s){
        System.out.println("string is : " + s );
        for(int j = 0 ; j < s.length() ; j++)
            for(int i = 0 ; i < s.length() -1  -j ; i++ ){
                if(s.charAt(i) > s.charAt(i+1)){
                    char tmp = s.charAt(i);
                    s.setCharAt(i , s.charAt(i+1) ) ;
                    s.setCharAt(i+1 , tmp ) ;
                    //System.out.println("sorted array : "+ s);
                }
           }

        System.out.println("sorted array : "+ s);
    }

    public static int[]  getInput(){
        System.out.println("hello tell me the number of array elements ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        for(int i = 0 ; i < arraySize ; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

}
