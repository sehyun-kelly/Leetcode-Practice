/** My Solution - 87.11%, 7.39% */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> dups = new HashMap<>();

        int pos = 0;

        while(pos < nums.length){
            if(dups.containsKey(nums[pos])){
                int val = dups.get(nums[pos]);
                int diff = pos - val;
                if(diff <= k && diff >= -k) return true;
            }

            dups.put(nums[pos], pos);
            pos++;
        }

        return false;
    }
}
