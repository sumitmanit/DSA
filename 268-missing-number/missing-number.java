class Solution {
    public int missingNumber(int[] nums) {
        //Sumit Goswami
        int n = nums.length;
        int sum = 0;
        int actualSum = 0;

        for(int i=0; i<=n; i++){
            actualSum += i;
        }
        for (int i : nums) {
            sum += i;
        }

        return actualSum - sum;
    }
}