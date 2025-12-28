class Solution {
    public int hammingWeight(int n) {
        int bit = 0;
        int i = 0;

        int count = 0;
        while (n > 0) {
            int rem = n % 2;
            if (rem == 1)
                count++;
            bit = bit + rem * (int) Math.pow(10, i);
            n = n / 2;
            i++;
        }
        return count;
    }
}