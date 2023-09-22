/** 100%, 89.23% */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        boolean power = true;

        while(n > 1){
            int remainder = n % 2;

            if(remainder != 0) return false;

            n /= 2;
        }

        return power;
    }
}