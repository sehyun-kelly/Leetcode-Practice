/** My Solution - 100%, 34.37% */

class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        int index = 0;

        while(l <= r){
            if(nums[r] == val) r--;

            if(l <= r && nums[l] == val && nums[r] != val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }

            if(nums[l] != val) l++;
        }

        return (r + 1);
    }
}
