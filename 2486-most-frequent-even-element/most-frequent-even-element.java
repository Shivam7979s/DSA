class Solution {
    public int mostFrequentEven(int[] nums) {
        int ct=-1;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int count=-1;

            for(int j=0;j<nums.length;j++){
                if(nums[i]%2==0 && nums[i]==nums[j] ){
                    count++;
                }
                
            }
            if(ct<count){
                ct=count;
                ans=nums[i];
            }
             else if(ct == count && nums[i] < ans){
                ans = nums[i];
            }
        }
        return ans;  
    }
}