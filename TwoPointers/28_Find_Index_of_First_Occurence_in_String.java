/** My Solution - 34.65%, 40.36% */

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;

        int l = 0, r = 0;
        int ptr = 0;

        while(l < haystack.length() && r < haystack.length()){
            String curr = haystack.substring(l, r + 1);
            if(curr.equals(needle)) return l;

            if(haystack.charAt(r) == needle.charAt(ptr)){
                r++;
                ptr++;
            }else{
                ptr = 0;
                l++;
                r = l;
            }
        }

        return -1;

    }
}

/** Solution - 100%, 71.84% */
class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needLen = needle.length();

        if(hayLen < needLen) return -1;

        for(int i = 0; i <= hayLen - needLen; i++){
            int j = 0;
            while(j < needLen && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
                if(j == needle.length()) return i;
            }
        }

        return -1; 
    }
}
