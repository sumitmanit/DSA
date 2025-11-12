class Solution {
    public int missingNumber(int[] nums) {
          int n = nums.length;

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

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