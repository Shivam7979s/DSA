class Solution {
    public int sumOfUnique(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
          
            for(int j=0;j<nums.length;j++){
                
                if(i!=j && nums[i]==nums[j]){
                    count++;
                   
                }
            }
            if(count==0 ){
                ans+=nums[i];
            }
        }
        return ans;

        
    }
}