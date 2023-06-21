/** 100%, 72.55% */

class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;

        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;

        for(int i = 2; i <= n - 1; i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n - 1];
    }
}
