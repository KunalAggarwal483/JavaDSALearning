package P_Arrays;

import readwrite.FastReader;

public class UnionArray {

    private static int size = 0;

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 == 0 && n2 == 0){
            return new int[]{};
        }

        if(n1 == 0){
            return nums2;
        }
        if(n2 == 0){
            return nums1;
        }

        int[] result = new int[n1 + n2];
        int k = 0;
        int i = 0, j = 0;

        if(nums1[i] < nums2[j]){
            result[k++] = nums1[i++];
        }
        else if(nums1[i] > nums2[j]){
            result[k++] = nums2[j++];
        }
        else{
            result[k++] = nums1[i++];
            j++;
        }

        while(i < n1 && j < n2){

            if(nums1[i] < nums2[j]){

                if(result[k-1] != nums1[i])
                result[k++] = nums1[i];

                i++;
            }
            else if(nums1[i] > nums2[j]){

                if(result[k-1] != nums2[j])
                result[k++] = nums2[j];

                j++;
            }
            else{
                result[k++] = nums1[i];
                i++;
                j++;
            }
        }

        while(i < n1){

            if(result[k-1] != nums1[i])
            result[k++] = nums1[i];
            i++;

        }
        
        while(j < n2){

            if(result[k-1] != nums2[j])
            result[k++] = nums2[j];
            j++;
        }

        size = k;
        return result;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {1, 1, 2, 4, 9, 10};
        int[] nums2 = {0, 0, 1, 2, 3, 4, 8};
        int[] union = unionArray(nums1, nums2);

        FastReader fr = new FastReader();

        System.out.println("Union of the two arrays is: ");
        for(int i = 0; i < size; i++){
            System.out.print(union[i] + " ");
        }
    }
    
}
