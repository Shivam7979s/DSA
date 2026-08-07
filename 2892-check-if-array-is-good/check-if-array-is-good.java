class Solution {
    public boolean isGood(int[] nums) {
        
        int n=nums.length;
        if(n==1){
            return false;
        }
        int base=n-1;
        Arrays.sort(nums);
        for(int i=0;i<base;i++){
            if(i+1!=nums[i]){
                return false;
            }
           
        }
        return nums[base] == nums[base-1];
    }
}