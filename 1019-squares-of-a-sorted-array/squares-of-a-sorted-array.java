class Solution {
    public int[] sortedSquares(int[] nums) {
        //Sumit goswami
        int[] temp = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while(left<=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare>rightSquare){
                temp[index--]=leftSquare;
                left++;
            }else{
                temp[index--]=rightSquare;
                right--;
            }
        }

        return temp;
    }
}