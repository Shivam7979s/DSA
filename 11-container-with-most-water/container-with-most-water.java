class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int last=height.length-1;
        int most=0;
        while(start<last){
            int distance=last-start;
            
            if(height[start]<height[last]){
                int area=height[start]*distance;
                if(most<area){
                    most=area;
                }
                start++;
            }
            else{
                int area=height[last]*distance;
                if(most<area){
                    most=area;
                }
                last--;
            }
        }
        return most;
    }
}