class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Sumit Goswami
         List<Integer> row = new ArrayList<>();

        long val = 1;

        for (int i = rowIndex; i >=0; i--) {

            row.add((int)val);

             val = val * i/(rowIndex-i + 1);

            
        }

        return row;
    }
}