class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majority=nums[0],vote=0;

        for(int i=0;i<n;i++){
            if(vote==0){
                vote++;
                majority=nums[i];
                
            }
            else if(nums[i]==majority){
                vote++;
            }
            else{
                vote--;
            }
        }
        return majority;

    
    }
}