/** My Solution - 99.96%, 90.47% */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minCount = nums.length;

        while(l <= r && r < nums.length) {
            if(sum < target) {
                sum += nums[r++];
            }else {
                int count = r - l;
                if(count < minCount) minCount = count;
                sum -= nums[l++];
                if(sum == target && minCount == 1) return 1;
            }
        }

        if(l == 0){
            if(sum < target) return 0;
            if(sum == target) return nums.length;
        }

        while(l < nums.length) {
            if(sum >= target){
                int count = r - l;
                if(count < minCount) minCount = count;
                sum -= nums[l];
            }

            l++;
        }

        return minCount;

    }
}