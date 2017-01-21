package chapter1;

/**
 * Created by patimshi on 1/21/2017.
 */
public class SpacesWithDifChar {

    public static void main (String []args){
        SpacesWithDifChar obj = new SpacesWithDifChar();
        System.out.println(obj.getConvertString("hello very good morning !"));;
        //System.out.println(obj.getConvertUsingSubString("hello very good morning !"));;

    }

    /**
     * Space Complexity : O n2
     * Time Complexity : O n
     * @param s
     * @return
     */
    public String getConvertString(String s ){
        StringBuilder sb  = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Problem with this implementation as its not able to
     * calculate the index properly
     * @param s
     * @return
     */
    public String getConvertUsingSubString(String s ){
        StringBuilder sb  = new StringBuilder();
        int index = s.indexOf(' ');
        int lastIndex = 0 ;
        while(index > -1 ){
            sb.append(s.substring(lastIndex , index)+"%20");
            lastIndex = index;
            index = s.substring(lastIndex , s.length()-1 ).indexOf(' ');
        }
        return sb.toString();
    }
}
