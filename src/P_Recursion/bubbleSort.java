package P_Recursion;

import readwrite.FastReader;

public class bubbleSort {

    public static void bubble(int[] arr, int n, int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[c + 1]){
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, n, r, c + 1);
        }else{
            bubble(arr, n, r - 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 0, 0};
        int n = arr.length;

        FastReader sc = new FastReader();
        bubble(arr, n, n - 1, 0);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
