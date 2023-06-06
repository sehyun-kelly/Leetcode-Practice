/** 35. Search Insert Position - 100%, 89.99% */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;

        while(l <= r){
            mid = (l + r) / 2;

            if(nums[mid] == target) return mid;

            if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }

        return nums[mid] > target ? mid : mid + 1;
    }
}
