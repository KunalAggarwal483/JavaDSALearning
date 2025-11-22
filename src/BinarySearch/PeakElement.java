package BinarySearch;

public class PeakElement {

    public static int peakElement(int[] arr){

        int start = 0, end = arr.length -1;

       while(start < end){

        int mid = start + (end - start) /2;

        if(mid < arr.length - 1 && arr[mid] <= arr[mid + 1]){

            start = mid + 1;

        }
        else{
            if(mid > 0 &&  arr[mid] >= arr[mid -1]) return mid;
            else end = mid - 1;
        }
       }

       return start;

    }

    public static void main(String[] args) {
        
        // int[] arr = {3, 9, 9, 8, 6, 5};
        int[] arr = {8 ,8, 8, 8, 9, 8, 8};
        int peakIdx = peakElement(arr);
        System.out.println("Peak Element is at index: " + peakIdx + " with value: " + arr[peakIdx]);
    }
    
}
