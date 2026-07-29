class Solution {
    public int findShortestSubArray(int[] nums) {
        // Sumit Goswami
        HashMap<Integer , Integer> first = new HashMap<>();
        HashMap<Integer , Integer> freq = new HashMap<>();
        HashMap<Integer , Integer> last = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!first.containsKey(nums[i])){
                first.put(nums[i],i);
            }
            last.put(nums[i],i);

            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        int degree = 0;
        for(int i : freq.keySet()){
            degree = Math.max(degree,freq.get(i));
        }

        int min = Integer.MAX_VALUE;
        for(int j: freq.keySet()){
            if(freq.get(j) == degree){
              int  len = last.get(j) - first.get(j) + 1;
               if(len<min){
                min = len;
            }
            }

           
        }

        return min;
    }
}