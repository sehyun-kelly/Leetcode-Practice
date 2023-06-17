/** My Solution - 100%, 32.70% */

class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int count = 0;

        while(index >= 0 && s.charAt(index) == ' ') index--;
        while(index >= 0 && s.charAt(index) != ' '){
            index--;
            count++;
        }

        return count;
    }
}
