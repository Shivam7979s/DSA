class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;

        int mid=n/2;
        return nums[mid];

        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]){
        //         count++;
        //     }
        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        // return nums[0];
    
    }
}