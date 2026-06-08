import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        int[] ans=new int[nums.length+1];
        for(int i=0;i<ans.length;i++){
            ans[i]=i;
        }
        for(int i=0;i<nums.length;i++){
            if(ans[i]!=nums[i]){
                return ans[i];
            }
        }
        return nums.length;
    }
}