class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int i = 0;
        int j = n;
        int t = 0;
        int[] ans = new int[len];
        while (i <= j && j <len){
            if ( t% 2 ==0){
                ans[t ] = nums[i];
                i++;
            }
            else{
                ans[t ] = nums[j];
                j++;
            }
            t++;
        }
        return ans;
    }
}