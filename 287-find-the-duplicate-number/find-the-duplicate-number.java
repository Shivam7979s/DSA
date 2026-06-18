class Solution {
    public int findDuplicate(int[] nums) {
        for(int x:nums){
            int ind=Math.abs(x)-1;
            if(nums[ind]<0)return Math.abs(x);
            nums[ind]=-nums[ind];
        }
        return -1;
    }
    
}