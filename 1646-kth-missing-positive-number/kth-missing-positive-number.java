class Solution {
    public int findKthPositive(int[] nums, int k) {
        int n = nums.length;
        int i =1;
        int ct = 0;
        while (true){
            boolean flag = false;

            if(isAvailable(nums ,i) ){
                flag = true;
                }

            i++;
            if(!flag){
                ct++;
            }
            if(ct == k){
                break;
            }
        }
        return i-1;
    }
    static boolean isAvailable(int[] nums , int i ){
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == i){
                return true;
            }
            else if(nums[mid] > i){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return false;
    }
}