/** My Solution - 69.09%, 61.94% */

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len = s.length();
        int l = 0, r = len - 1;

        while(l < r){
            while(l < len - 1 && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(r > 0 && !Character.isLetterOrDigit(s.charAt(r))) r--;
            char left = s.charAt(l);
            char right = s.charAt(r);

            if(l < r && left != right) return false;
            l++;
            r--; 
        }

        return true;
    }
}
