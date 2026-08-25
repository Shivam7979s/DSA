class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int m = k;

        while (true) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (nums[i] == m) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return m;
            }

            m += k;
        }
    }
}