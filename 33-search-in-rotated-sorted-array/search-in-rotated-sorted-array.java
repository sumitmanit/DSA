class Solution {
    // Sumit Goswami
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

         int pivot = start;

        int result = binarySearch(nums, 0, pivot - 1, target);

        if (result == -1) {
            result = binarySearch(nums, pivot, nums.length - 1, target);
        }

        return result;
    }

    static int binarySearch(int[] nums, int start, int end, int target) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

}