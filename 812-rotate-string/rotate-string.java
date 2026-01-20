class Solution {
    public boolean rotateString(String s, String goal) {
         char[] ch = s.toCharArray();

         // Sumit Goswami

        int k = 1;

        int count = 0;

        while (k == 1 && count < s.length()) {

            int i = s.length() - 2;
            int j = s.length() - 1;

            while (j > 0) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i--;
                j--;

            }
               
              String result = new String(ch);

           if (goal.equals(result)){
             k = 0;

             return true;
           }

           count++;
        }

        return false;
    }
}