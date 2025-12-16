class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        // Sumit Goswai
        
      int i = num.length - 1;

        List<Integer> result = new ArrayList<>();

        while(i>=0 || k>0 ){

            if(i>=0){
                 k+=num[i];
            i--;
            }

            result.add(k%10);
            k = k/10;
           
        }

       



        Collections.reverse(result);
        return result;

       
    }
}