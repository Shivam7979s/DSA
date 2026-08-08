class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long count = 0;

        for(int i = 0; i < n;i++){
            if(nums[i] == target ){
                nums[i]=1;
            }
            else{
                nums[i]=-1;
            }
        }
        int[] nums2=new int[n];
        nums2[0]= nums[0];
        for(int i=1;i<n;i++){
            nums2[i] = nums2[i-1] + nums[i];

        }
        int shift = n;
        int [] freq = new int[2*n+1];

        freq[shift]= 1;
        long valid = 0;
        int lastsum= 0;
        for(int i=0;i<n;i++){
            if(nums2[i]>lastsum ){
                valid+=freq[lastsum+shift];
            }
            else{
                valid-=freq[nums2[i]+shift];
            }
            count +=valid;
            freq[nums2[i]+shift]++;
            lastsum = nums2[i];

        }
        return count ;
    }
}