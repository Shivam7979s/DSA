class Solution {
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        
        for(int i = 0 ; i < s1.length(); i++){
            if(s1Array[i] != s2Array[i])return false;
        }
        return true;
    }
}