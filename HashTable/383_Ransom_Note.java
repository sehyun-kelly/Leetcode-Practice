/** My Solution - 12.51%, 5.47% */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < magazine.length(); i++){
            list.add("" + magazine.charAt(i));    
        }

        for(int i = 0; i < ransomNote.length(); i++){
            String curr = "" + ransomNote.charAt(i);
            if(list.contains("" + curr)){
                list.remove("" + curr);
            }else{
                return false;
            }
        }

        return true;
    }
}

/** using int array - 71.62%, 78.65% */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        int[] alphabet = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            alphabet[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char cur = ransomNote.charAt(i);
            if(alphabet[cur - 'a'] == 0) return false;
            alphabet[cur - 'a']--;
        }

        return true;
    }
} 
