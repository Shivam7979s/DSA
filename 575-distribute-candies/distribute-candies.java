class Solution {
    public int distributeCandies(int[] candyType) {
        int n =  candyType.length;
        int can = n / 2;
        Arrays.sort(candyType);
        int type = 1;
        for (int i = 1; i < n; i++) {
            if ( candyType[i-1] != candyType[i]){
                type++;
            }
        }
        if(can >= type)return type;
        else return can;
    }
}