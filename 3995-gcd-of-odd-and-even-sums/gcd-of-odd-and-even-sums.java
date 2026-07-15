class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even = 0;

        int oddNum = 1;
        int evenNum = 2;

        while (n > 0) {
            odd += oddNum;
            even += evenNum;

            oddNum += 2;
            evenNum += 2;
            n--;
        }

        return gcd(odd, even);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}