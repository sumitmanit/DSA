class Solution {
    // Sumit Goswami
    public int[] searchRange(int[] nums, int target) {
       int[] ans = {-1,-1};

         ans[0] =  firstOccurence(nums, target);
         ans[1] =  lastOccurence(nums, target);
        return ans;
    }

    static int firstOccurence(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;
    }

     static int lastOccurence(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;
    }
}