/** My Solution - 100%, 55.03% */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ", 0);
        if(pattern.length() != str.length) return false;

        HashMap<Character, String> patternMap = new HashMap<>();
        
        for(int i = 0; i < str.length; i++){
            char pat = pattern.charAt(i);
            String word = str[i];

            if(!patternMap.containsKey(pat)){
                if(!patternMap.containsValue(word)) patternMap.put(pat, word);
                else return false;
            }else{
                if(!patternMap.get(pat).equals(word)) return false;
            }
        }

        return true;
    }
}

