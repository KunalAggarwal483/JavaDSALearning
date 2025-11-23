package P_Arrays;

import java.util.*;

import readwrite.FastReader;

public class LongestSubArrWithSum {

    /*
     * Question : Given an array of integers nums and an integer k, return the length of the longest subArray with sum equals to k.
     * case 1 : array contains non-negative numbers only
     * case 2 : array contains negative numbers also
     */

    // Optimal Approach - Sliding Window (Only for Non-Negative Numbers)
    public static int longestSubArrayOptimal(int[] nums, int k){

        int n = nums.length;

        int left = 0, right = 0, currSum = 0, maxLen = 0;

        while(right < n){

            currSum += nums[right];

            while(left <= right && currSum > k){

                currSum -= nums[left];
                left++;
            }

            if(currSum == k){

                int currLength = right - left + 1;
                maxLen = Math.max(maxLen, currLength);
            }

            right++;
        }

        return maxLen;
    }


    public static int longestSubArrayHashing(int[] nums, int k){

        int n = nums.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int currSum = 0, maxLen = 0;
        
        for(int i =0; i<n; ++i){

            currSum += nums[i];
            if(currSum == k) maxLen = Math.max(maxLen, i+1);

            if(hm.containsKey(currSum - k)){

               int currLength  = i - hm.get(currSum - k);
                maxLen = Math.max(maxLen, currLength);
            }

            //update the map only currSum is not present to maintain longest length
            if(!hm.containsKey(currSum))
            hm.put(currSum,i);
        }

        return maxLen;
    }


    public static int longestSubArray(int[] nums, int k){

        int n = nums.length;

        int maxLength = 0;

        for(int i = 0; i < n; i++){

            int currentSum = 0;

            for(int j = i; j < n; j++){

                currentSum += nums[j];

                if(currentSum == k){

                    int currentLength = j - i + 1;

                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {
        

        // int[] nums = {10, 5, 2, 7, 1, 9};
        int[] nums = {1, 2, 3, 0, 1, 1, 1, 4, 2, 3};
        int k = 3;

        FastReader fr = new FastReader();

        // System.out.println("Longest Subarray Length (Brute Force): " + longestSubArray(nums, k));
        System.out.println("Longest Subarray Length (Hashing): " + longestSubArrayHashing(nums, k));
    }
    
}
