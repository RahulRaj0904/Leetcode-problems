class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) count[d]++;

        List<Integer> res = new ArrayList<>();
        
        for (int num = 100; num <= 999; num += 2) {
            int a = num / 100, b = (num / 10) % 10, c = num % 10;
            count[a]--; count[b]--; count[c]--;
            if (count[a] >= 0 && count[b] >= 0 && count[c] >= 0) {
                res.add(num);
            }
            count[a]++; count[b]++; count[c]++;
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}