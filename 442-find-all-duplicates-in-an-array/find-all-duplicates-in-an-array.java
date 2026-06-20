class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value to find the mapped 0-based index
            int index = Math.abs(nums[i]) - 1;
            
            // If the element at this mapped index is negative, it's a duplicate
            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                // Otherwise, flip the sign to mark this number as "seen"
                nums[index] = -nums[index];
            }
        }
        
        return result;
    }
}