class Solution {
    // Sumit Goswami
    public boolean search(int[] nums, int target) {         

        int start = 0;
        int end = nums.length - 1;

        int pivot = findPivotWithDuplicates(nums, start, end);
     if (pivot == -1) {
            return binarysearch(nums, start, end, target);
        }
        if(nums[pivot]==target){
            return true;
        }
         if(target>=nums[start]){
          return  binarysearch(nums,start,pivot-1,target);
        }else{
           return binarysearch(nums,pivot+1,end,target);
        }
            
            
    }

     static boolean binarysearch(int[] nums, int start, int end, int target) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
     static int findPivotWithDuplicates(int[] nums, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (end > mid && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {

                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;

            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}