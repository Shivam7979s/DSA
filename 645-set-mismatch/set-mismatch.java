class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int[] arr = new int[2];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                arr[0] = nums[i];
            }
        }

        int sum = 0;
        for (int x : nums) {
            sum += x;
        }

        int n = nums.length;
        int expected = n * (n + 1) / 2;

        arr[1] = expected - (sum - arr[0]);

        return arr;
    }
}