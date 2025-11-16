class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Sumit Goswami
         int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, high = (n*m-1);
        while (left<=high) {
            int mid = (left+high)/2;

            int row = mid/m;
            int col = mid%m;

            if (matrix[row][col]==target) {
                return true;
            }else if(matrix[row][col]<target){
                left = mid + 1;
            }else {
                high = mid - 1;
            }

        }

        return false;
    }
}