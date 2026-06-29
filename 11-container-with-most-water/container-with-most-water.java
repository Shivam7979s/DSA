class Solution {
    public int maxArea(int[] height) {
    

        int start=0;
        int last=height.length-1;
        int most=0;
        while(start<last){
            if(height[start]<height[last]){
                int ct=height[start]*(last-start);
                if(most<ct){
                    most=ct;
                }
                start++;
            }
            else{
                int ct=height[last]*(last-start);
                if(most<ct){
                    most=ct;
                }
                last--;
            }
        }
        return most;
    }
}