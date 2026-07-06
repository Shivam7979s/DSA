class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        // return recursive_binary_search(nums, target, start, end);
        return binary_search(nums, target , start, end);

    }
    public int recursive_binary_search(int[] nums,int target,int start,int end){    // this is recursive binary search 
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            start=mid+1;
            return recursive_binary_search(nums, target, start, end);
        }
        else{
            end=mid-1;
            return recursive_binary_search(nums, target, start, end);

        }
    }
    public int binary_search(int[] nums,int target ,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
           
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    
}