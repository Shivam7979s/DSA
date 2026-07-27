class Solution {
    public int maxProduct(int[] nums) {
        int max=0;

        for(int i = 0;i<nums.length;i++){
            int prod=max;
            for(int j = i+1;j<nums.length;j++){
                int pd= (nums[i]-1)*(nums[j]-1);
                if(max<pd){
                    max=pd;
                }
            }
    
        }
        return max;
    }
}