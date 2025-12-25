class Solution {
    public boolean check(int[] nums) {

        // Sumit goswami
        int r = nums.length - 1;
        reverse(nums, 0, r);
        int j = 0;
        while (j < nums.length-1 && nums[j] >= nums[j+1]  ) {
            j++;
        }

         reverse(nums, 0, j);
        reverse(nums, j + 1, r);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
                
            }
        }

        return true;
    }

     private static void reverse(int[] nums, int i, int r) {
        while (i < r) {
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
            i++;
            r--;
        }
    }
}