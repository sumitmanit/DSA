class Solution {
    public int[] plusOne(int[] digits) {
        // Sumit Goswami

        int rev = 0;
        int n = digits.length;

        for(int i = n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                break;
            }

            digits[i] = 0;
        }
        
            if(digits[0]==0){
                int[] newArr = new int[n+1];
                newArr[0] = 1;

                return newArr;
            }
        


        return digits;
    }
}