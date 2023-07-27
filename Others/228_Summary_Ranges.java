/** My Solution - 87.35%, 46.94% */

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        int pos = 0;

        while(pos < nums.length){
            StringBuilder range = new StringBuilder();
            int before = pos;
            while(pos < nums.length - 1 && (nums[pos + 1] - nums[pos] == 1)) pos++;
            
            if(pos != before) range.append(nums[before] + "->");
            range.append(nums[pos]);
            ranges.add(range.toString());
            pos++;
        }

        return ranges;
    }
}
