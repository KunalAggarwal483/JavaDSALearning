package P_Recursion;

import java.util.ArrayList;

import readwrite.FastReader;

public class LetterCombinationsPhone {

    public static String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static ArrayList<String> letterCombinations(String str, String p){

        if(str.isEmpty()){
            
            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }

        ArrayList<String> result  = new ArrayList<>();
        char ch = str.charAt(0);
        int digit = ch - '0';
        for(int i = 0; i < mapping[digit].length(); ++i){

           result.addAll(letterCombinations(str.substring(1), p + mapping[digit].charAt(i)));

        }

        return result;
    }

    public static void main(String[] args) {

        String str = "234";
        FastReader sc = new FastReader();
        ArrayList<String> result = letterCombinations(str, "");
        System.out.println(result);

        
    }
    
}
