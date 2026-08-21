class Solution {
    public int minimumDifference(int[] nums, int k) {
                Arrays.sort(nums);
        int n= nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int temp=Math.abs(nums[i]-nums[i+k-1]);
            if(min>temp){
                min=temp;
            }
        }
        return min;
    }
}