package P_Recursion;

import readwrite.FastReader;

public class BinarySearchRotatedArray {

    public static int search(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[left] <= arr[mid]) {
            if (target >= arr[left] && target < arr[mid]) {
                return search(arr, target, left, mid - 1);
            } else {
                return search(arr, target, mid + 1, right);
            }
        } 
        // Right half must be sorted
      
            if (target > arr[mid] && target <= arr[right]) {
                return search(arr, target, mid + 1, right);
            }

            return search(arr, target, left, mid - 1);
            
        
    }


    // To search for minimum value in a rotated array (with duplicates)

   public static int searchMin(int [] arr){

        int n = arr.length;

        int left = 0, right = n -1;

        int minVal = Integer.MAX_VALUE;
        int idx = -1;

        while(left < right){

            int mid = (left + right)/ 2;
            System.out.println("mid value is : " + arr[mid]);

            // if(mid > left && mid < right && arr[mid] < arr[mid -1 ] && arr[mid] < arr[mid + 1]){

            //     return mid;
            // }

            // if(arr[mid] == arr[left] && arr[mid] == arr[right]){

            //     left ++;
            //     right--;
            //     continue;
            // }

            // if(mid > left &&  arr[mid -1] > arr[left]){

            //     minVal = Math.min(minVal,left);
            //     left = mid + 1;

            // }
            // else{

            //     minVal = Math.min(minVal, mid);
            //     right = mid - 1;
            // }

            // if(arr[mid] >= arr[left]){

            //     minVal = Math.min(minVal, left);
            //     left = mid + 1;
            // }
            // else{
            //     right = mid -1;
            //     minVal = Math.min(minVal, mid);

            // }

            if(arr[mid] > arr[right]){

            //    if(arr[left] < minVal){
            //     minVal = arr[left];
            //     idx = left;
            //    }
                left = mid + 1;
                
            }
            else{
                right = mid;
               
            //     if(arr[mid] < minVal){
            //     minVal = arr[mid];
            //     idx = mid;
            //    }
            }

        }

        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 5, 5, 3, 2, 1, 0};
        // int[] arr = { 3, 3, 4, 6, 8, 0 , 1};
        // int[] arr = { 6 , 1 , 2};
        int target = 0;
        FastReader fr = new FastReader();
        // int result = search(arr, target, 0, arr.length - 1);

        // if (result != -1) {
        //     System.out.println("Element found at index: " + result);
        // } else {
        //     System.out.println("Element not found in the array.");
        // }

        System.out.println(searchMin(arr));
    }
    
}
