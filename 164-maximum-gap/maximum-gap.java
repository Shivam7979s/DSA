class Solution {
    public int maximumGap(int[] nums) {

        Arrays.sort(nums);
        int max =0;
        if(nums.length <2){
            return 0;
        }

        for(int i=1;i<nums.length;i++){
            int difference = nums[i]- nums[i-1];
            if(difference > max){
                max = difference;
            }
        }

        return max;
        
    }
}