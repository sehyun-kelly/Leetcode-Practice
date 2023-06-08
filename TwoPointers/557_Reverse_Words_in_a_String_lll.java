/** My Solution - 6.66%, 6.16% */

class Solution {
    public String reverseWords(String s) {
        int l = 0, r = 0;
        String res = "";

        while(l < s.length() && r < s.length()){
            while(r < s.length() && s.charAt(r) != ' ') r++;

            int pos = r - 1;
            while(l <= pos){
                res += s.charAt(pos);
                pos--;
            }
            res += ' ';

            l = r + 1;
            r = l;
        }

        return res.trim();
    }
}

