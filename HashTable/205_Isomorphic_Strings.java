/** My Solution - 59.81%, 62.77% */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> charMaps = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!charMaps.containsKey(sChar)){
                if(!charMaps.containsValue(tChar)) charMaps.put(s.charAt(i), t.charAt(i));
                else return false;
            }else{
                if(charMaps.get(sChar) != tChar) return false;
            }
        }
        
        return true;
    }
}

