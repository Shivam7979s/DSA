class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int[] sum=new int[n];
        int min=Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            int num = nums[i];
            int ct = 0;

            while (num > 0) {
            ct += num % 10;  
            num /= 10;        
            }
            if(min>ct){
                min=ct;
            }

            sum[i]=ct;
        }
        
        return min;
    }
}