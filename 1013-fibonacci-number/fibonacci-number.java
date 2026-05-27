class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int temp;
        for(int i=2;i<=n;i++){
            temp=a;
            a=b;
            b=temp+b;
            
        }
        if(n==0){
            return 0;
        }
        else{
            return b;
        }
       
        
    }
}