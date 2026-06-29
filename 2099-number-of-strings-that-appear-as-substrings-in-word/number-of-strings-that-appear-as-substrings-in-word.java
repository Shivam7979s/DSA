class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int index=word.indexOf(patterns[i]);
            if (index >=0) {
                ans++;
            }
        }
        return ans;
    }
}