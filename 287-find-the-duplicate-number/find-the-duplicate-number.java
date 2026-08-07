
class Solution {
    public int findDuplicate(int[] nums) {
        // Sumit Goswami

        int n = nums.length-1;
        int ans = 0;

        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            if(set.contains(i)){
                ans = i;
            }else{
                set.add(i);
            }
        }

        return ans;
       
    }
}