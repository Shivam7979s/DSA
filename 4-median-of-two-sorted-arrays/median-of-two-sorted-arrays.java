class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] nums=new int[n1+n2];
        int n=nums.length;

        for(int i=0;i<n1;i++){
            nums[i]=nums1[i];
        }
         for(int i=0,j=n1;i<n2;i++,j++){
            nums[j]=nums2[i];
        }
        Arrays.sort(nums);
        if(n%2!=0){
           int ans=n/2;
            return nums[ans];
        }
        else{
            int a=n/2;
            double b=nums[a]+nums[a-1];
            double ans=b/2;
            return ans;
        }
        
    }
}