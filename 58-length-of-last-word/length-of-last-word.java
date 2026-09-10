class Solution {
    public int lengthOfLastWord(String str) {
        int n  = str.length();
        int count = 0;
        boolean flag = false;
        String name = new String();
        for (int i = 0; i <n; i++) {
            if (str.charAt(i) != ' ') {
                if (!flag) {
                    flag = true;
                    count=1;
                }
                else {
                    count++;
                }
            }
            else {
                flag = false;
            }
        }
        return count;
    }
} 