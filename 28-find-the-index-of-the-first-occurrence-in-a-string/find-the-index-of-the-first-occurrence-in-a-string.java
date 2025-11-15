class Solution {
    public int strStr(String haystack, String needle) {
        // Sumit Goswami
        int n = haystack.length();
        int m = needle.length();
        
        if (m == 0) return 0;  
        
        for (int i = 0; i <= n - m; i++) {
            String sub = haystack.substring(i, i + m);
            
            if (sub.compareTo(needle) == 0) {
                return i;
            }
        }
        
        return -1;
    }
}
