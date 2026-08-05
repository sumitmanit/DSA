class Solution {
    // Sumit Goswami
    public static boolean isValidAns(int maxS , int[] nums, int k ){
        
        int count = 1;
        int sum = 0;

        for(int i = 0; i<nums.length; i++){
            if(sum + nums[i]<=maxS){

                sum = sum + nums[i];
            }else{

                count++;
                if(count>k || nums[i]>maxS){
                    return false;
                }else{

                    sum = 0;
                    sum = sum + nums[i];
                }
            }
        }

        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int s = 1;
        int sum = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        if(n<k){
            return 0;
        }
        int e = sum;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidAns(mid,nums,k)){

                ans = mid;

                e = mid - 1;
                
            }else{

                s = mid + 1;
            }
        }

        return ans;
    }
}