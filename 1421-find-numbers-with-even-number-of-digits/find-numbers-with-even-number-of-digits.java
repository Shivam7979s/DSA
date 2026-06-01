class Solution {
    public int findNumbers(int[] nums) {

        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;

           for(int num = nums[i]; num > 0; num = num / 10){
                count++;
            }

            if(count % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}