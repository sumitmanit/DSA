class Solution {
    // Sumit Goswami
    public int pivotInteger(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            int sum2 = 0;
            sum += i;
            for(int j=i; j<=n; j++){
                sum2 += j;
            }

            if(sum==sum2){
                return i;
            }
        }

        return -1;
    }
}