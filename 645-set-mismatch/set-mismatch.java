class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                arr[0]=nums[i];
            
            }
        }
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]>0){
                nums[ind]*=-1;
            }
           
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[1]=i+1;
            }
        }

        return arr;
    }
}