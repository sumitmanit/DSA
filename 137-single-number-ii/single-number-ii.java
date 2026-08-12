class Solution {
    public int singleNumber(int[] nums) {
        // Sumit Goswami

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int ans = 0;
        for(int num: map.keySet()){
            if(map.get(num)==1){
                ans = num;
            }
        }

        return ans;
    }
}