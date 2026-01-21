class Solution {
    public String largestOddNumber(String num) {
        // Sumit Goswami
         int n = num.length();

        StringBuilder sb = new StringBuilder();

        char[] st = num.toCharArray();

        if ((st[n - 1] -'0') % 2 != 0) {
            sb.append(st);
        } else {

            int i = n -1;

            while (i>=0) {
                if ((st[i] - '0') % 2 != 0) {
                    sb.append(num.substring(0,i+1));
                    break;
                }
                i--;

            }
        }

        // String s = new String(str);

        return sb.toString();
    }
}