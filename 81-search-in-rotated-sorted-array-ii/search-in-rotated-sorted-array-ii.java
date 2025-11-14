class Solution {
    public boolean search(int[] nums, int target) {

        // Sumit Goswami
         Arrays.sort(nums);

        int first = Arrays.binarySearch(nums, target);


        int start = first, end = first;
        if(first>-1){
              while (start > 0 && nums[start - 1] == target) {
            start--;
        }

        while (end < nums.length - 1 && nums[end + 1] == target) {
            end++;
        }
        if(nums[start]==target || nums[end]==target){
            return true;
            }
        }

        

        return false;
    }
}