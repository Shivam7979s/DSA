class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int time=n/4;
        
        for(int i=0;i<n;i++){
            if (arr[i] == arr[i + time]) {
                return arr[i];
            }
        }
        return -1;
    }
}