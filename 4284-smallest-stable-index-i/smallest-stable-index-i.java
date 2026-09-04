class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0;i < n; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int m = 0;m <= i;m++){
                if(max<nums[m]){
                    max=nums[m];
                }
            }
            for(int mn=i;mn<n;mn++){
                if(min>nums[mn]){
                    min=nums[mn];
                }
            }
            if(max-min<=k){
                return i;
            }
        }

        return -1;
    }
}