/** 85.69%, 94.16% */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dups = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(dups.contains(nums[i])) return true;

            dups.add(nums[i]);
        }

        return false;
    }
}