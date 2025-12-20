class Solution {
    public int[] countBits(int n) {
        // Sumit Goswami
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int min = i;
            int count = 0;

            while (min > 0) {
                if ((min & 1) == 1) {
                    count++;
                }
                min = min >> 1;
            }

            arr[i] = count;
        }

        return arr;
    }
}