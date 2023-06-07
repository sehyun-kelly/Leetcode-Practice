/** 977. Squares of a sorted array - 100%, 47.58% */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1, i = nums.length - 1;
        int[] numSquared = new int[nums.length];

        while(l <= r){
            int lSquared = nums[l] * nums[l];
            int rSquared = nums[r] * nums[r];

            if(lSquared > rSquared){
                numSquared[i] = lSquared;
                l++;
            }else{
                numSquared[i] = rSquared;
                r--;
            }

            i--;
        }

        return numSquared;
    }
}

