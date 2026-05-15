/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 // Sumit Goswami
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int firstTry = binarySearchinFirstHalf(mountainArr,start,target);

        if(firstTry!=-1){
            return firstTry;
        }

        return binarySearchinSecondHalf(mountainArr,start,target);
    }

     static int binarySearchinSecondHalf(MountainArray mountainArr, int start, int target) {
        int end = mountainArr.length()-1;
         while (start <= end) {
            int mid = (start + end) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    } 
      static int binarySearchinFirstHalf(MountainArray mountainArr, int end, int target) {
        int start = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }  
}