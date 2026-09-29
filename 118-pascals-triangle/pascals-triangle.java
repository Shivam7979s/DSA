class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        List<Integer>firstrow = new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        for(int i = 1; i < numRows; i++){
            List<Integer>prow = result.get(i-1);
            List<Integer>row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(prow.get(j) +  prow.get(j-1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}