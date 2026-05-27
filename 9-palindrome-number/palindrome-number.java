class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        for(; x>0;x=x/10){
            int rem=x%10;
            rev=rev*10+rem;
        }
        if(rev==org){
            return true;
        }
        else{
            return false;
        }
        
    }
    //
}