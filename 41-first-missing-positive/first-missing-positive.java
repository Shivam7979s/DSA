class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);

        int n=nums.length;
//
        int target =1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                target++;
            }
        }
        return target;

           
     
    }
}