class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2;  // ways to climb 1 and 2 stairs
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}