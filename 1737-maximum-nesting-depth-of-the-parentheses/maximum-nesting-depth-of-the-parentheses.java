class Solution {
    public int maxDepth(String s) {
        int n =  s.length();;
        int p = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                p++;
            }
            if (s.charAt(i) == ')') {
                p--;
            }
            if(p > m){
                m = p;
            }

        }
        return m ;
    }
}