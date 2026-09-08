class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] can = new int[n];
        for(int i=0;i<n;i++){
            can[i] = 1;
        }
        //compare with left neighbor
        for(int i=0;i<n;i++){
            if(i>=1 && ratings[i]>ratings[i-1] && ((can[i] < can[i-1]) || (can[i] == can[i-1] ))) {
                can[i]= can[i-1]+1;

            }
        }
        // compare with right neighbor
        for(int i=n-1;i>=0;i--){
            if(i<=n-2 && ratings[i]>ratings[i+1] && ((can[i] < can[i+1]) || (can[i] == can[i+1] ))) {
                can[i] = can[i+1]+1;

            }
        }
        int mincan=0;
        for(int i=0;i<n;i++){
            mincan += can[i];
        }
        return mincan;
    }
}