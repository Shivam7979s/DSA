class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
       long ans=0;
        while(n!=0){
           long rem=n%10;
            if(rem!=0){
                sum+=rem;
                ans=ans*10+rem;
            }
            n=n/10;
        }
       long a=0;
        while(ans!=0){
           long rem=ans%10;
            if(rem!=0){
                
                a=a*10+rem;
            }
            ans=ans/10;
        }

        return sum*a;
    }
}