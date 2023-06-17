/** My Solution - 19.19%, 27.28% */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        String res = "";

        while(true){
            boolean isFound = false;
            char test = '0';

            for(int i = 0; i < strs.length; i++){
                if(index >= strs[i].length()){
                    isFound = true;
                    break;
                }

                if(test == '0') test = strs[i].charAt(index);
                else if(strs[i].charAt(index) != test){
                    test = '1';
                    break;
                }
            }

            if(test == '0' || test == '1' || isFound) break;
            res += strs[0].charAt(index);
            index++;
        }

        return res;

    }
}
