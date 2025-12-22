class Solution {
    // Sumit Goswami
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) {
           return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(ch1)) {
                    return false;
                }
            }else{
                if (used.contains(ch1)) {
                    return false;
                }
                map.put(ch, ch1);
                used.add(ch1);
            }
        }
        return true;
    }
}