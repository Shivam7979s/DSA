class Solution {
    public boolean isPalindrome(int x) {
        int orignal=x;
        int reverse=0;
        for(; x>0;x=x/10){
            int rem=x%10;
            reverse=reverse*10+rem;
        }
        if(reverse==orignal){
            return true;
        }
        else{
            return false;
        }
        
    }

}