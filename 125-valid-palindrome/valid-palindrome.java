class Solution {
    public boolean isPalindrome(String s) {
        
        String cleanStr =s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n=cleanStr.length();
        
        int start=0;
        int end=n-1;
        while(start<end){
            char st=cleanStr.charAt(start);
            char ed=cleanStr.charAt(end);
            if(st!=ed){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}