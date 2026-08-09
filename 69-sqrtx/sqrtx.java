class Solution {
    public int mySqrt(int x) {
        int sq=1;
        if(x<2){
            return x;
        }
        while((long )sq*sq<=x){
           
            sq++;
        }
        return sq-1;
    }
}