import java.util.Arrays;

class Solution {
    public int maxScore(int[] nums) {

       Arrays.sort(nums);

        for(int i = 0, j = nums.length - 1; i < j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        long sum = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > 0){
                max++;
            }
        }

        return max;
    }
}