package P_Arrays;

import readwrite.FastReader;

public class Kadanes {


    public static void printMaxSumSubArray(int[] arr){

        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        int left = 0, right = 0;

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] > maxEndingHere + arr[i]){
                maxEndingHere = arr[i];
                left = i;
            }
            else{
                maxEndingHere += arr[i];
            }

            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
                right = i;
                // You can store the indices here if needed
            }
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("Maximum Subarray Sum is: " + maxSoFar);
        System.out.print("Subarray with maximum sum is: ");
        for(int i = left; i <= right; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int kadanesAlgorithm(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] arr = {-2, -3, -4, -1, -2, -1, -1, -3};
        FastReader fr = new FastReader();
        // int maxSubArraySum = kadanesAlgorithm(arr);
        // System.out.println("Maximum Subarray Sum is: " + maxSubArraySum);

        printMaxSumSubArray(arr);
    }
    
}
