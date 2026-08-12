class Solution {
    // Sumimt Goswami
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0 ; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int index = 0;
        for(int item: map.keySet()){
            if(map.get(item)==1){
                arr[index] = item;
                index++;
            }
        }

        return arr;
    }
}