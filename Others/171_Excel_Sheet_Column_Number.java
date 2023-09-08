/** 98.74%, 6.7% */
class Solution {
    public int titleToNumber(String columnTitle) {
        int pos = columnTitle.length() - 1;
        int digit = 0;
        int col = 0;

        while(pos >= 0) {
            char curr = columnTitle.charAt(pos--);

            col += (curr - 'A' + 1) * Math.pow(26, (digit++));
        }

        return col;
    }
}