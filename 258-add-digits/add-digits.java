class Solution {
    public int addDigits(int num) {
        while(num>=10){

            int digits=0;
            while (num>0) {
                int rem=num%10;
                digits+=rem;
                num=num/10;
            }
            num=digits;
        }
        return num;

        
    }
}