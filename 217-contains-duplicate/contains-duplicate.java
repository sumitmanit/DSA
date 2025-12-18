class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Sumit Goswami

        HashSet<Integer> set = new HashSet<>();
         boolean hasDuplicate = false;

        for (int x : nums) {
            if (!set.add(x)) {
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
    }
}