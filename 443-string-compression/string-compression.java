class Solution {
    // Sumit Goswami
public int compress(char[] chars) {
    int i = 0; 
    int k = 0;

    while(i<chars.length){
        char ch = chars[i];
        int count = 0;

        while(i<chars.length && chars[i]==ch){
            count++;
            i++;
        }

        chars[k++] = ch;

        if(count>1){
            for(char c: String.valueOf(count).toCharArray()){
                chars[k++] = c;
            }
        }
    }

    return k;
}

}
