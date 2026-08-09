class Solution {
    public String reverseWords(String s) {
        // Sumit Goswami
        StringBuilder sc = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            sc.append(s, i+1, end+1);
            sc.append(" ");
        }

        return sc.toString().trim();
    }
}