class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int res = 0;

        while (a >= b) {
            long temp = b, count = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                count <<= 1;
            }
            a -= temp;
            res += count;
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}