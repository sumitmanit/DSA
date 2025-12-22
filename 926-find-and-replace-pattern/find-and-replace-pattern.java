class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        // Sumit Goswami

        ArrayList<String> set = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {    

            HashMap<Character, Character> map = new HashMap<>();
            HashSet<Character> used = new HashSet<>();

            boolean match = true;

            for (int j = 0; j < pattern.length(); j++) {
                char ch = pattern.charAt(j);
                char ch1 = words[i].charAt(j);

                if (map.containsKey(ch)) {
                    if (!map.get(ch).equals(ch1)) {
                        match = false;
                        break;
                    }
                } else {
                    if (used.contains(ch1)) {
                        match = false;
                        break;
                    }

                    map.put(ch, ch1);
                    used.add(ch1);
                }
            }

            if (match) {
                set.add(words[i]);
            }
        }

        return set;
    }
}