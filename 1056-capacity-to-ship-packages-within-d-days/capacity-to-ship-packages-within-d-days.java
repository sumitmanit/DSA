class Solution {
    // Sumit Goswami
    public static boolean isValidAns(int[] nums , int k , int validAns){
        int count = 1;
        int capacity = 0;

        for(int i = 0; i<nums.length; i++){
            if(capacity + nums[i]<=validAns){
                capacity = capacity + nums[i];
            }else {
                count ++;
                if(count>k || nums[i]>validAns){
                    return false;
                }else{
                    capacity = 0;
                    capacity = capacity + nums[i];
                }
            }
        }

        return true;
    }


    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int s = 0;
        int ans = 0;

        if(days>n){
            return 0;
        }
        for(int i =0; i<n; i++){
            sum += weights[i];
        }

        int e = sum;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidAns(weights,days,mid)){

                ans = mid;
                e = mid - 1;
            }else {
                s = mid +1;
            }
        }

        return ans;
    }
}