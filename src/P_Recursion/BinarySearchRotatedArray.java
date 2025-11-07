package P_Recursion;

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

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = search(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
