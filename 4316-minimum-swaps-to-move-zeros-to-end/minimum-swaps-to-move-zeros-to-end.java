class Solution {
    public int minimumSwaps(int[] nums) {
    
        int n= nums.length;
        if(n<=1){
            return 0;
        }
        int step = 0;
        for(int i=0, j=n-1;j>0 && j>= i&& i<n;){
            if(nums[i]==0 && nums[j]!=0){
                int temp =nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                step++;
                i++;

                j--;
            }
            else if(nums[i]==0 && nums[j]==0){
                j--;
            }
            else{
                i++;
            }
        }
        return step;
    }
}