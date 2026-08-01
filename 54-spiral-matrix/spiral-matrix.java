class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Sumit Goswami
        int m = matrix.length;
        int n = matrix[0].length;
        int startingCol = 0;
        int startingRow = 0;
        int endingRow = m-1;
        int endingCol = n-1;

        ArrayList<Integer> list = new ArrayList<>();
        while(startingCol<= endingCol && startingRow<=endingRow){

            for(int col = startingCol; col<=endingCol; col++){
                list.add(matrix[startingCol][col]);
            }
            startingRow++;
            for(int row = startingRow; row<=endingRow; row++){
                list.add(matrix[row][endingCol]);
            }
            endingCol--;
            if(startingRow<=endingRow){
                 for(int col = endingCol; col>=startingCol; col--){
                list.add(matrix[endingRow][col]);
            }
            endingRow--;
            }
            if(startingCol<=endingCol){
                 for(int row = endingRow; row>= startingRow; row--){
                list.add(matrix[row][startingCol]);
            }
             startingCol++;
            }
           
        }
        return list;
        
    }   
}