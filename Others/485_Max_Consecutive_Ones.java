/** 42.61%, 57.97% */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int n : nums) {
            if(n == 0) count = 0;
            count += n;
            max = Math.max(count, max);
        }

        return max;
    }
}