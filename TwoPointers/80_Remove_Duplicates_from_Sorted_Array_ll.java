/** My Solution - 7.94%, 85.19% */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums[0] == nums[nums.length - 1]) return 2;

        int i = 0, j = 0, count = 0;
        int len = nums.length;

        while(i < len - 2 - count){
            if(nums[i] == nums[i + 2]){
                count++;
                j = i + 2;
                while(j < len - 1){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    j++;
                }
            }else{
                i++;
            }
        }

        return len - count;
    }
}

/** Not My Solution - 100%, 73.61% */
class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;

        for(int n : nums){
            if(pos < 2 || n > nums[pos - 2]){
                nums[pos++] = n;
            }
        }

        return pos;
    }
}
