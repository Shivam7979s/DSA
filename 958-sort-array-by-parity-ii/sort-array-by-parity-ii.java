class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        for(int i=0;i<nums.length;){
            if(nums[i]%2==0 && i%2!=0){
                int temp=nums[i];
                nums[i]=nums[even];
                nums[even]=temp;
                even+=2;
            }
            else if(nums[i]%2!=0 && i%2==0){
                int t=nums[i];
                nums[i]=nums[odd];
                nums[odd]=t;
                odd+=2;
            }
            else{
                i++;
            }
        }
        return nums;
    }
}