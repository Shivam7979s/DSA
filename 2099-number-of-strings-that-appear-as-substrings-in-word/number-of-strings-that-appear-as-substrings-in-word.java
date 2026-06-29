class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int index=word.indexOf(patterns[i]);
            if (index >=0) {
                count++;
            }
        }
        return count;
    }
}