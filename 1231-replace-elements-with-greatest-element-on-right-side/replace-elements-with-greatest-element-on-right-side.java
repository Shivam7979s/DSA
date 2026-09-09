class Solution {
    public int[] replaceElements(int[] nums) {
        int n =  nums.length;
        int[] ans = new int[n];
        for(int i =0;i<n;i++){
            int m = -1;
            for(int j =i+1;j<n;j++){
                m = Math.max(m,nums[j]);
            }
            ans[i] = m;
        }
        return ans;
    }
}