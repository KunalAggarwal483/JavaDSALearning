package P_Recursion;
import java.util.ArrayList;
import java.util.List;

import readwrite.FastReader;

import java.util.Arrays;

public class SubsetsArrays {

    public static List<List<Integer>> subsetsIterative(int[] arr){

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // adding empty subset
        for(int i = 0; i< arr.length; i++){
            result.add(Arrays.asList(arr[i]));

            if(i> 0 && arr[i] == arr[i-1]){
                continue; // skip duplicates
            }
            
            for(int j = i+1; j < arr.length; j++){

                List<Integer> subset = new ArrayList<>(result.get(result.size() - 1));
                subset.add(arr[j]);
                result.add(subset);
            }
        }

        return result;


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        FastReader sc = new FastReader();
        List<List<Integer>> result = subsetsIterative(arr);
        System.out.println(result);
    }
    
}
