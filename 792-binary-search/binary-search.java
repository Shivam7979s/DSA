class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        return bs(nums, target, start, end);

    }
    public int bs(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            start=mid+1;
            return bs(nums, target, start, end);
        }
        else{
            end=mid-1;
            return bs(nums, target, start, end);

        }
    }
}