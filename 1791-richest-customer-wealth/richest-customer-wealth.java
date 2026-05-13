class Solution {
    // Sumit Goswami
    public int maximumWealth(int[][] accounts) {
        
        int maxwelth = Integer.MIN_VALUE;
        
        for (int[] item : accounts) {
            int temp = 0;
            for (int i : item) {
                 temp += i; 
            }

            if(temp>maxwelth){
                maxwelth = temp;
            }
        }

        return maxwelth;
    }
}