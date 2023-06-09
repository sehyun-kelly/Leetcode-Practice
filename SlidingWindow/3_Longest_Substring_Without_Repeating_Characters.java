/** Brute Foce - 6.1%, 6.39% */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max = 0;

        for(int i = 0; i < len; i++){
            String sub = "";
            for(int j = i; j < len; j++){
                if(sub.contains("" + s.charAt(j))) break;

                sub += s.charAt(j);
                max = Math.max(max, sub.length());
            }
        }

        return max;
    }
}


/** HashMap - 86.1%, 16.33% */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> substr = new HashMap<>();
        int l = 0, r = 0;

        while(r < s.length()){
            char curr = s.charAt(r);
            if(substr.containsKey(curr) && substr.get(curr) >= l){
                l = substr.get(curr) + 1;
            }

            max = Math.max(max, r - l + 1);
            substr.put(curr, r++);
        }

        return max;
    }
}
