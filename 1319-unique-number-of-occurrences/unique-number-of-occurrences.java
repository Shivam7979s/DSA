class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        Arrays.sort(nums);
        int distinct = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                distinct++;
            }
        }
        int[] freq = new int[distinct];

        int index = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                freq[index++] = count;
                count = 1;
            }
        }
        freq[freq.length-1] = count;
        Arrays.sort(freq);
        for(int i=1;i<freq.length;i++){
            if(freq[i]==freq[i-1]){
                return false;
            }
        }
        return true;
    }
}