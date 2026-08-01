class Solution {
    public int maximumCount(int[] nums) {
        // Sumit Goswami
        
        int firstZeroOrPositive = lowerBound(nums,0);
        int firstPositive = lowerBound(nums,1);

        int negetive = firstZeroOrPositive;
        int positive = nums.length - firstPositive;

        return Math.max(positive,negetive);
    }

    static int lowerBound(int[] nums,int target){
            int l = 0;
            int h = nums.length;

            while(l<h){
                int mid = l + (h - l) / 2;

                if(nums[mid]<target){
                    l = mid + 1;
                }else {
                    h = mid;
                }
            }

            return l;
        }
}