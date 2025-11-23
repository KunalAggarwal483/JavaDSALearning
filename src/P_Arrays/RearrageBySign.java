package P_Arrays;

import readwrite.FastReader;

public class RearrageBySign {


    public static void rearrageBySign(int[] nums){

        int n = nums.length;
        int left = 0, right = 1;

        while(left < n && right < n){

            if(nums[left] < 0 && nums[right] > 0){
                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left += 2;
                right += 2;

                continue;
            }

            if(nums[left] > 0){
                left +=2;
            }   

            if(nums[right] < 0){
                right +=2;
            }
        }

        //print the modified array
        for(int i =0; i<n; ++i){
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        
        // int[] nums = {3, -2, -5, 6, -7, 8, -1, 4};
        int[] nums = {1, 2, 3, 4, -1, -2, -3, -4};
        FastReader fr = new FastReader();
        rearrageBySign(nums);
    }
    
}
