class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;

        int nums[] = new int[n];

        for(int i=0;i<n1;i++){
            nums[i]=nums1[i];
            }
        for(int i=0,j=n1;i<n2;i++,j++){
            nums[j]=nums2[i];
            }
        Arrays.sort(nums);

        if(n%2==0){
            int m = n/2;
            return (double)(nums[m]+nums[m-1])/2.00;
            }
        else{
            return nums[n/2];
        }

    }
}