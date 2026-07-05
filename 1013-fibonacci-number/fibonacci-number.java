class Solution {
    public int fib(int n) {
        return findfib(n);

    }
    public int findfib(int n){
        if(n<2){
            return n;
        }
        return findfib(n-1)+findfib(n-2);
    }
}