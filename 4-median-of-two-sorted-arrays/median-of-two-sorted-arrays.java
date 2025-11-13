class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Sumit Goswami
    int[] temp = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, temp, 0, nums1.length);
    System.arraycopy(nums2, 0, temp, nums1.length, nums2.length);

        Arrays.sort(temp); 

        int n = temp.length;
        float result;

        if (n % 2 == 0) {
            int mid = n / 2;
            result = (temp[mid - 1] + temp[mid]) / 2.0f;
        } else {
            result = temp[n / 2];
        }

        return result;
    }
}