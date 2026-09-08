class Solution {
    public int[] sortArray(int[] nums) { 
        int n = nums.length;
        if(n<=1){
            return nums;
        }
        int mid = n/2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0,mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid,n));
        return merge(left , right );
    }
    public int[] merge(int[] left , int[] right){
        int r = right.length;
        int l = left.length;
        int[] mix = new int[r+l];
        int i = 0;
        int j = 0;
        int k = 0;

        while( i<r && j<l){
            if(right[i]<left[j]){
                mix[k] = right[i];
                i++;
                k++;
            }
            else{
                mix[k] = left[j];
                j++;
                k++; 
            }
        }
        while( i < r ){
            mix[k] = right[i];
            i++;
            k++;
        }
        while ( j < l){
            mix[k] = left[j];
            j++;
            k++;
        }
        return mix;
    }
}