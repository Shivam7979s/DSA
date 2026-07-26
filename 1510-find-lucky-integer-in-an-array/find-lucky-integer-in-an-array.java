class Solution {
    public int findLucky(int[] nums) {
        Arrays.sort(nums);

        int ans = -1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {

                if (count == nums[i - 1]) {
                    ans = nums[i - 1];
                }

                count = 1;
            }
        }

        // Check the last number
        if (count == nums[nums.length - 1]) {
            ans = nums[nums.length - 1];
        }

        return ans;
    }
}