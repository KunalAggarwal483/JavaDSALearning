package P_Recursion;
import java.util.ArrayList;

public class SubsetsStrings {

    public static ArrayList<String> subsetsReturn(String str, String ans){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add(ans);
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subsetsReturn(str.substring(1), ans + ch);
        ArrayList<String> right = subsetsReturn(str.substring(1), ans);

        left.addAll(right);
        return left;
    }


    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = subsetsReturn(str, "");
        System.out.println(result);
    }
    
}
