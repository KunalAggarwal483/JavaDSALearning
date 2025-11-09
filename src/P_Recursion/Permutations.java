package P_Recursion;
import java.util.ArrayList;
import java.util.List;
public class Permutations {

    public static ArrayList<String> permutationsRecursive(String str, String p){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());

           result.addAll(permutationsRecursive(str.substring(1), f + str.charAt(0) + s)); 
        }

        return result;

    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = permutationsRecursive(str, "");
        System.out.println(result);
    }   
    
}
