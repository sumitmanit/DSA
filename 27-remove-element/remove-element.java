class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
         Integer[] temp = new Integer[n];
          int j = 0;

          for (int i = 0; i < n; i++) {

            if (nums[i]!=val) {

                temp[j] = nums[i];


                j++;
            }
           
        }
        for(int i=0; i<n; i++){
        if (temp[i]!=null) {
            count++;
            nums[i] = temp[i];
        }
       }

       return count;
    }
}