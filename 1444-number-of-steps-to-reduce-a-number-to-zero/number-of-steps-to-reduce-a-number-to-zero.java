class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        return reduce(num, count);
       
    }
    public int reduce(int n,int count){
       
        if(n==0){
          
            return count;
        }
        if(n%2==0){
           return reduce(n/2,count+1);
        }
        else{
            return reduce(n-1,count+1);
        }
      
    }
    
}