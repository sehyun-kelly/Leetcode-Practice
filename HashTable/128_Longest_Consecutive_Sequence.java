/** 59.19%, 47.33% */
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }

        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int curr = 1;
            int currNum = nums[i];

            while(numsSet.contains(++currNum)) {
                curr++;
                numsSet.remove(currNum);
            }


            currNum = nums[i];
            while(numsSet.contains(--currNum)) {
                curr++;
                numsSet.remove(currNum);
            }

            max = curr > max ? curr : max;
        }


        return max;
    }
}