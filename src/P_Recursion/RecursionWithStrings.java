package P_Recursion;

import readwrite.FastReader;

public class RecursionWithStrings {

    public static String skipCharacter(String str, char ch){

        if(str.length() == 0){
            return "";
        }

        if(str.charAt(0) == ch){

            return skipCharacter(str.substring(1), ch);
        }
        else{

            return str.charAt(0) + skipCharacter(str.substring(1), ch);
        }
    }


    public static String skipString(String str, String skipStr){


        if(str.length() == 0){
            return "";
        }

        if(str.startsWith(skipStr)){

            return skipString(str.substring(skipStr.length()), skipStr);
        }
        else{

            return str.charAt(0) + skipString(str.substring(1), skipStr);
        }
    }


    public static void main(String[] args) {
        String str = "abacadaeaf";
        char ch = 'a';
        FastReader sc = new FastReader();
        String result = skipCharacter(str, ch);
        System.out.println("Result1: " + result); // Output: "bcdef"

        String str2 = "baccaddaeaf";
        String skipStr = "add";
       System.out.println("Result2: " + skipString(str2, skipStr));
    }
    
}
