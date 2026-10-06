class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Sumit Goswami
        int l = 1;
        int r = max(piles);
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;

            long totalTime = totalHours(piles,mid);
            if(totalTime<=h){
                ans = mid;
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return ans;
        // for(int i = 1; i<=max(piles); i++){
        //    int  totalTime = totalHours(piles,i);

        //     if(totalTime<=h){
        //         return i;
        //     }
        // }

    }

    static int max(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    static long totalHours(int [] arr,int hours){
        long totalTime = 0;
        for(int i=0; i<arr.length; i++){
            
            totalTime += (arr[i] + hours-1)/hours;
        }

        return totalTime;
    }
}