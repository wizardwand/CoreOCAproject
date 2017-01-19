package aaaString;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by patimshi on 1/16/2017.
 */
public class StringLength {

    public static void main(String []s){
        String str = "0123456789012345678901234567890123456789012345678901234567890123456789";
        String result = getStringMax40char(str);
        System.out.println(result);

        folderLogicV2();
        folderLogicV3();

        checkIndexOf();
    }
    private static void checkIndexOf() {
    String abc  = "abc";
    String test = "abc 3 b sd ";
    System.out.println(test.indexOf(abc));
    }



    private static String  getStringMax40char(String str) {
        if(str.length() > 40 ){
            String substring = str.substring(0, 40);
            return substring;
        }else {
            return str;
        }
    }

    private static void folderLogic(){
        String folderName = "";
        if(folderName.equals("Esityksen laatiminen") || folderName.equals("Viranhaltijapäätöksen laatiminen")  || folderName.equals("Lähtevä kirje") || folderName.equals("Lausunnon laatiminen") ){

        }else if (folderName.equals("Lausuntopyyntö luotu") || folderName.equals("Toimeksianto luontu") ){

        }else if (folderName.equals("Siirretty asianohjaajalle") || folderName.equals("Siirretty valmistelijalle") || folderName.equals("Palautettu valmistelijalle")){

        }
    }

    private static void folderLogicV2(){
        String folderName = "Siirretty valmistelijalle 2";
        int checkIndex = 0 ;
        if(folderName.indexOf("Esityksen laatiminen") > checkIndex || folderName.indexOf("Viranhaltijapäätöksen laatiminen") >checkIndex || folderName.indexOf("Lähtevä kirje") > checkIndex  || folderName.indexOf("Lausunnon laatiminen") > checkIndex ||
                folderName.indexOf("Lausuntopyyntö luotu") > checkIndex || folderName.indexOf("Toimeksianto luontu") > checkIndex ){
            System.out.println("of type 1 and 2 logic here ");
            //if not drafting
            //Asiakirjasta on luonnos
            System.out.println("of type 3 logic here ");
        }else if (folderName.indexOf("Siirretty asianohjaajalle") > checkIndex|| folderName.indexOf("Siirretty valmistelijalle") > checkIndex || folderName.indexOf("Palautettu valmistelijalle") > checkIndex){
            System.out.println("of type 4 logic here ");
        }else{
            System.out.println("default logic !!  ");
        }
    }

    private static void folderLogicV3(){

        ArrayList<String> actionFolders = new ArrayList<String>(Arrays.asList("abc shi" , "pqr" , "xyz"));
        String actionFolderName = "";
        String[] fSplit = actionFolderName.split(" ");
        if(fSplit.length >= 2) {
                    System.out.println("is present ? " + actionFolders.contains(fSplit[0] +" " + fSplit[1]));
        }


        String folderName = "Siirretty asianohjaajalle shirish";
        int checkIndex = -1 ;
        if(folderName.indexOf("Esityksen laatiminen") > checkIndex || folderName.indexOf("Viranhaltijapäätöksen laatiminen") >checkIndex || folderName.indexOf("Lähtevä kirje") > checkIndex  || folderName.indexOf("Lausunnon laatiminen") > checkIndex ||
                folderName.indexOf("Lausuntopyyntö luotu") > checkIndex || folderName.indexOf("Toimeksianto luontu") > checkIndex ){
            System.out.println("of type 1 and 2 logic here ");
            //if not drafting
            //Asiakirjasta on luonnos
            System.out.println("of type 3 logic here ");
        }else if (folderName.indexOf("Siirretty asianohjaajalle") > checkIndex|| folderName.indexOf("Siirretty valmistelijalle") > checkIndex || folderName.indexOf("Palautettu valmistelijalle") > checkIndex){
            System.out.println("of type 4 logic here ");
        }else{
            System.out.println("default logic !!  ");
        }
    }

}
