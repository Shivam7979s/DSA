class Solution {
    public int alternateDigitSum(int n) {
         int n1=0;
        while(n !=0){
            int rem = n%10;
            n1=n1*10+rem;
            n/=10;

        }
        int sum=0;
        int time =0;
        while(n1!=0){
            int rem = n1%10;

            if(time %2 !=0){
                sum= sum-rem;
            }
            else{
                sum=sum+rem;
            }
            time++;
            n1/=10;
        }
        return sum;
    }
}