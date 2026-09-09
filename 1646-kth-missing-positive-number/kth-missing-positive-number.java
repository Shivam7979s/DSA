class Solution {
    public int findKthPositive(int[] nums, int k) {
        int n = nums.length;
        int i = 1;
        int ct = 0;
        while (true){
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(nums[j] == i ){
                    flag = true;
                }
            }
            i++;
            if(!flag){
                ct++;
            }
            if(ct == k){
                break;
            }
        }
        return i-1;
    }
}