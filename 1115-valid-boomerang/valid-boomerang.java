class Solution {
    public boolean isBoomerang(int[][] points) {
        int a=points[1][1]-points[0][1];
        int b=points[1][0]-points[0][0];

        int c=points[2][1]-points[1][1];
        int e=points[2][0]-points[1][0];

        int ab=a*e;
        int bc=c*b;

        return ab!=bc;
        
    }
}