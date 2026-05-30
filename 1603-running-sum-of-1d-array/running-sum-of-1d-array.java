class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans= new int[nums.length];
        int count=0;
        for(int i=0;i<ans.length;i++){
            count=count+nums[i];
            ans[i]=count;
        }
        return ans;
        
    }
}