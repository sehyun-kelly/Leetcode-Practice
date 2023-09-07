/** My solution - 84.20%, 64.38% */
class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        StringBuilder str = new StringBuilder();

        int ptr = s.length() - 1;

        while(ptr >= 0){
            StringBuilder temp = new StringBuilder();

            while(ptr >= 0 && s.charAt(ptr) != ' ') {
                temp.append(s.charAt(ptr));
                ptr--;
            }
            str.append(reverse(temp.toString()));
            if(ptr >= 0) str.append(' ');

            while(ptr >= 0 && s.charAt(ptr) == ' ') ptr--;
        }

        return str.toString();
    }

    public String reverse(String s){
        StringBuilder str = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}