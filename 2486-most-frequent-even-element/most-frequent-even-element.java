class Solution {
    public int mostFrequentEven(int[] nums) {

        int ct = 0;
        int ans = -1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 != 0) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count > ct) {
                ct = count;
                ans = nums[i];
            }
            else if(count == ct && nums[i] < ans) {
                ans = nums[i];
            }
        }

        return ans;
    }
}