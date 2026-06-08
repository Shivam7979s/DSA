class Solution {
    public int dominantIndex(int[] nums) {
        int largest=-1;
        int index=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
                index=i;
            }
            
        }
      
        for(int i=0;i<nums.length;i++){
            if(i!=index && largest<nums[i]*2){
                return -1;
            }
        }
        return index;
    
    }
}