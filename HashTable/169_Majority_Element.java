/** My Solution - 9.48%, 71.86% */

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxVal = 0;
        int maxKey = 0;

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }

            int val = map.get(nums[i]);
            map.put(nums[i], ++val);
            if(map.get(nums[i]) > maxVal){
                maxVal = map.get(nums[i]);
                maxKey = nums[i];
            }
        }

        return maxKey;
    }
}
