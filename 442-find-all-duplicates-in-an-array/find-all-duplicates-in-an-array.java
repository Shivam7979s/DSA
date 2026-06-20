class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i])-1;
           
            if(nums[index]>0){
                nums[index]*=-1;
            }
            else{
                list.add(index+1);
            }
            
        }
        return list;
 
    }
}