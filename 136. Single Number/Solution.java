class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(list.contains(nums[i])){
                list.remove(list.indexOf(nums[i]));
            }else{
                list.add(nums[i]);
            }
        }

        return list.get(0);
        
//         int result = nums[0];
        
//         for(int i = 1; i < nums.length; i++){
//             result ^= nums[i];
//         }
        
//         return result;
    }
}