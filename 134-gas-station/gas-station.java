class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int n = gas.length;
        int totalgas = 0;
        int totalcost = 0;
        for(int i=0;i<n;i++){
            totalcost +=cost[i];
            totalgas += gas[i];
        }
        if(totalcost > totalgas){
            return -1;
        }
        int currentGas=0;
        int start = 0;
        for(int i=0;i<n;i++){
            currentGas +=gas[i]-cost[i];
            if(currentGas<0){
                currentGas= 0;
                start = i+1;
            }
        }
        return start;

    }
}