class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);


        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> previousRow = result.get(i-1);
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);

            for (int j = 1; j < i; j++) {
                nextRow.add(previousRow.get(j) + previousRow.get(j-1));
            }
            nextRow.add(1);
            if(i == rowIndex){
                ans =  nextRow;
            }
            result.add(nextRow);
        }
        return ans;
    }
}