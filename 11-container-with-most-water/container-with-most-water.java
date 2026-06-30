class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int last = height.length-1;
        int max = 0;
        while(start < last){
            int distance = last - start;
            
            if(height[start] < height[last]){
                int area = height[start] * distance;
                if(max < area){
                    max = area;
                }
                start++;
            }
            else{
                int area = height[last] * distance;
                if(max < area){
                    max = area;
                }
                last--;
            }
        }
        return max;
    }
}