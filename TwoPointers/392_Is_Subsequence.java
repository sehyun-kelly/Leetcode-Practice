/** My Solution - 61.24%, 18.57% */

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;

        int sIndex = 0;
        int tIndex = 0;

        while(sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)) sIndex ++;

            tIndex++;
        }

        return (sIndex == s.length());
    }
}
