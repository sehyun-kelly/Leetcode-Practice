/** 98.68%, 54.83% */

class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int l = 1, r = x / 2;

        while(l < r){
            int pos = l + (r - l) / 2 + 1;

            int val = x / pos;
            if(val == pos) return pos;
            if(val < pos) r = pos - 1;
            else l = pos; 
        }

        return l;
    }
}
