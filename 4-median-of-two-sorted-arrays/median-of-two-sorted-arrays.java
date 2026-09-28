class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] nums = new int[n];

        int i = 0; 
        int j = 0;
        int k = 0;
        
        while( i < n1 && j < n2 ){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i++;
                k++;
            }
            else{
                nums[k] = nums2[j];
                j++;
                k++;
            }
        }

        while ( i < n1 ){
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while ( j < n2 ){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        int mid = n / 2;
        
        if ( n % 2 != 0){
            return nums[mid];
        }
        else{
            double ans = nums[mid] + nums[mid-1];
            return ans/2.0;
        }

    }
}