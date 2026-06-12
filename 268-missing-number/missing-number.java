import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums){
        int n=nums.length;
        int sum=n*(n+1)/2;
        int acsum=0;

        for(int i=0;i<nums.length;i++){
            acsum+=nums[i];
    
        }
        int ans=sum-acsum;
        return ans;
       
    }
}