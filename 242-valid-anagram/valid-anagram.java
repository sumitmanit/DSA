class Solution {
    // Summit Goswami
    public boolean isAnagram(String s, String t) {

        StringBuilder sbS = new StringBuilder(s);
        StringBuilder sbT = new StringBuilder(t);

        if (sbS.length() != sbT.length()) {
            return false;
        }

        for (int i = 0; i < sbS.length(); i++) {

            boolean matched = false;

            for (int j = 0; j < sbT.length(); j++) {
                if (sbS.charAt(i) == sbT.charAt(j)) {
                    sbT.deleteCharAt(j);
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                return false;
            }
        }

        return true;
    }
}
