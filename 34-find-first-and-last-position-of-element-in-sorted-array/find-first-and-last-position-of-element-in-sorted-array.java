class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = Arrays.binarySearch(nums, target);
        if (first < 0) return new int[]{-1, -1}; 

        int start = first, end = first;

        while (start > 0 && nums[start - 1] == target) start--;

        while (end < nums.length - 1 && nums[end + 1] == target) end++;

        return new int[]{start, end};
    
    }
}