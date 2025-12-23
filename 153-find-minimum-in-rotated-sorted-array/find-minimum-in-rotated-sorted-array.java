class Solution {
    public int findMin(int[] nums) {

        // Sumit Goswami
        int r = nums.length - 1;

        reverse(nums, 0, r);
        int j = 0;

        while (j < nums.length - 1 && nums[j] > nums[j + 1]) {
            j++;
        }
        reverse(nums, 0, j);
        reverse(nums, j+1, r);

        return nums[0];
    }

        private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }

    }
}