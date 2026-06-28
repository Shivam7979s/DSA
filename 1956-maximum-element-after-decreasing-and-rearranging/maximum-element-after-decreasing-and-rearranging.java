class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] nums) {
        Arrays.sort(nums);
        nums[0]=1;
        int n=nums.length;
        int max=nums[0];

         for(int i=1;i<n;i++){
             if(nums[i]>nums[i-1]+1){
                nums[i]=nums[i-1]+1;
                
             }
             if(max<nums[i]){
                    max=nums[i];
                }
            }
        return max;

    }
}