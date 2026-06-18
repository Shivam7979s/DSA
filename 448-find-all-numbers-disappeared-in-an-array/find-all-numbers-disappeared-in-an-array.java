class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // populate an array of length n with numbers from 1-n
        // with a nested for loop, compare each of the elements of nums with one element of the array of sequential numbers
        // if you cannot find one, then it is missing - add it to the new array
        // this is O(n^2) not good

        /**
        with the same array nums, go through a for loop for 0 through n-1
        in the array, nums[i] corresponds to a number -- mark nums[number - 1] as negative
        in the end, then go through the loop again
        the nums[i] that are positive correspond to the i+1 which is missing */

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]); // the index we are marking is the current nums[i] - 1
            if(nums[index-1] > 0) {
                nums[index-1] *= -1; // negate it and mark it only if not already negative
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}