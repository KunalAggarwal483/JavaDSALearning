package P_Strings;

import java.util.regex.Pattern;

public class CountPalindromes {


    static boolean checkIfPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1; 
        while (left < right) {

            if(str.charAt(left) != str.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }

    static int countPalindromicWordsInString(String str) {
        int n = str.length();
        
        return (int)Pattern.compile("\\s+").splitAsStream(str)
                .filter(word -> checkIfPalindrome(word))
                .count();
    }

    public static void main(String[] args) {
        String str = "madam oyo cut in";
        int count = countPalindromicWordsInString(str);
        System.out.println("Number of palindromic substrings in \"" + str + "\": " + count);
    }
    
}
