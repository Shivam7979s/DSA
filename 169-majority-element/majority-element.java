class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int mejority=nums[0],vote=0;

        for(int i=0;i<n;i++){
            if(vote==0){
                vote++;
                mejority=nums[i];
                
            }
            else if(nums[i]==mejority){
                vote++;
            }
            else{
                vote--;
            }
        }
        return mejority;

    
    }
}