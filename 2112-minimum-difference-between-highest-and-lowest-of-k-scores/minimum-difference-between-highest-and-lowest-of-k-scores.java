class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n= nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int temp=nums[i+k-1]-nums[i];
            min=Math.min(min,temp);

        }
        return min;
    }
}