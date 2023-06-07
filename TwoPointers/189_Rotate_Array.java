/** My Solution (Brute Force) - 50.39%, 78.71% */

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length < k) k = k % nums.length;

        int index = 0;
        int original = 0;
        int rotate = nums.length - k;
        int[] result = new int[nums.length];

        while(rotate <= nums.length - 1){
            result[index] = nums[rotate];
            index++;
            rotate++;
        }

        while(index < nums.length){
            result[index] = nums[original];
            index++;
            original++;
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = result[i];
        }
    }
}
