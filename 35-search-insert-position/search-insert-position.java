class Solution {
    // Sumit Goswami
    public int searchInsert(int[] nums, int target) {
        int left = 0, mid = 0;
        int n = nums.length;
        int high = n-1;
        while(left<=high){
            mid = (left+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return left;
    }
}