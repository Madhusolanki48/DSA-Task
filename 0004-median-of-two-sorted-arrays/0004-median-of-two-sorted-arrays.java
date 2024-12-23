class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int l1 = nums1.length;
       int l2 = nums2.length;
       int[] arr = new int[l1+l2];
       int i = 0, j = 0;
        int k = 0;
        while (i < l1 && j < l2) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < l1) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < l2) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        int l = l1+l2;
        if(l%2==0){
            return (arr[(l/2)-1] + arr[l/2])/2.0;
        }
        else{
            return arr[((l+1)/2)-1];
        }
    }
}