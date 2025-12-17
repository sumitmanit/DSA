class Solution {
    public String firstPalindrome(String[] words) {
        // Sumit Goswami
         String sub ="";

       for (int i = 0; i < words.length; i++) {
           StringBuilder str = new StringBuilder(words[i]);
           if (str.toString().equals(str.reverse().toString())) {

            sub = str.toString();
            break;
            
           }
       }

        return sub;
    }
}