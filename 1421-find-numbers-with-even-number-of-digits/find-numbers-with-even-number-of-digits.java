class Solution {

    // Sumit Goswami
    public int findNumbers(int[] nums) {
        
           int count = 0;

        for (int i : nums) {
            
           if(iseven(i)){
            
                count++;
           }
        }

        return count;
    }

    static boolean iseven(int i) {
         int numberOfdigits = digits(i);
         if(numberOfdigits%2==0){
            return true;
         }

         return false;
      }

      static int digits(int i){
        int count = 0 ;

        while(i>0){
            count++;
            i = i/10;
        }

        return count;
      }
}