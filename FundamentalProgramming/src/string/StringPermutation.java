package string;

public class StringPermutation{
    public static void main(String[] args) {
        String str = "ab";
        StringBuffer sb = new StringBuffer();
        for(int i =0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(sb.indexOf(ch+"") == -1 ){
                sb.append(ch);
            }
        }
        System.out.println("the String without dublicate's is : "+sb);
        permuteString(sb.toString());
        System.out.println("permutation " );

    }
    static void permuteString(String s){
        permutation(s, "");
    }
    static void permutation(String s , String prefix){
        if(s.length() ==0 ){
            System.out.println(prefix);
        }else{
            for(int i =0 ; i < s.length(); i++){
                String rem = s.substring(0,i) + s.substring(i+1);
                System.out.println(" "+ rem);
                permutation(rem, prefix+s.charAt(i));
            }
        }
    }
}