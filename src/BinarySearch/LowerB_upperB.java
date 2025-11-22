package BinarySearch;

public class LowerB_upperB {


    public static int lowerBound(int[] arr , int target){

        int start = 0, end = arr.length -1, ans = -1;

        while(start <= end){

            int mid = start + (end - start) /2;

            if(arr[mid] == target) ans = mid;

            if(arr[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }

        if(ans != -1){
            return ans;
        }

        if(start == arr.length){
            return -1;
        }
        return start;

    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,4,4,4,6,8,9};
        int target = 4;

        int lb = lowerBound(arr, target);
        System.out.println("Lower Bound of " + target + " is at index: " + lb);

    }


    
}
