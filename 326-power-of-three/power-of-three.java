class Solution {
    // Sumit Goswami
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        double i = 0;
        double result = 0;
        while(n>result){
             result = Math.pow(3,i);
            i++;
        }

        if(result==n) return true;
        
        return false;
    }

}