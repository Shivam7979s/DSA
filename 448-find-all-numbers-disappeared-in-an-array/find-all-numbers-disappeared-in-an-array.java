class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        
        // First loop: mark numbers as visited by negating the value at their index
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);  // Get the value at current index
            int index = num - 1; // Convert value to index (since numbers range from 1 to n)
            nums[index] = -Math.abs(nums[index]); // Mark as visited by negating it
        }
        
        // Second loop: check which indices stayed positive and add them to result
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) { // If it's still positive, it means we never visited this number
                list.add(i + 1); // Add the missing number (index + 1)
            }
        }
        
        return list;
    }
}