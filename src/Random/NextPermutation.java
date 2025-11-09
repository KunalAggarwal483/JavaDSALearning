package Random;

public class NextPermutation {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void nextPermutation(int[] nums) {

        // [2 , 1, 5, 4, 3, 0, 0]
        // i pointer to find the breakPoint - where nums[i] < nums[i+1] i.e first decreasing element from right
        // j pointer to find the just larger element than nums[i] from right side
        // swap i and j
        //reverse from i+1 to end

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        nextPermutation(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
