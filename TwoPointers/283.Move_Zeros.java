/** My solution - Runtime 5.3%, Memory 32.72% */

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        while(index < nums.length){
            int ptr = 0;
            while(nums[ptr] != 0 && ptr < nums.length - 1) ptr++;
            int next = ptr;
            while(next < nums.length - 1){
                int temp = nums[next];
                nums[next] = nums[next + 1];
                nums[next + 1] = temp;
                next++;
            }
            index++;
        }
    }
}

/** From Solution - 99.99%, 24.99% */
class Solution {
    public void moveZeroes(int[] nums) {
    int pos = 0;

    for(int num : nums){
        if(num != 0) nums[pos++] = num;
    }

    while(pos < nums.length){
        nums[pos++] = 0;
    }
    }
}

