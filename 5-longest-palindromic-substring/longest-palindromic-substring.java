class Solution {
    public String longestPalindrome(String s) {

        // Sumit Goswami

        if (s == null || s.length() < 2) return s;

        String longest = s.substring(0, 1); 
        for (int i = 0; i < s.length(); i++) {

            int l = i;
            int r = s.length() - 1;

            while (l < r) {
                if (s.charAt(l) == s.charAt(r)) {

                    if (checkPalindrom(s, l, r)) {
                        String sub = s.substring(l, r + 1);

                        if (sub.length() > longest.length()) {
                            longest = sub;
                        }
                        break;
                    }
                }
                r--;
            }
        }
        return longest;
    }

    private static boolean checkPalindrom(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
