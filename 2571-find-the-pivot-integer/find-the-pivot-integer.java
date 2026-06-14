class Solution {
    public int pivotInteger(int n) {
        int rsum=0;
        for(int i=1;i<=n;i++){
            rsum+=i;

        }
        int lsum=0;
        for(int i=1;i<=n;i++){
           lsum+=i;
           if(rsum==lsum){
            return i;
           }
           rsum-=i;
        }
        return -1;
    }
}