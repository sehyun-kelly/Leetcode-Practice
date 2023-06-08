/** My Solution - 99.9%, 56.86 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int l = 0, r = numbers.length - 1;

        while(l < r){
            if(numbers[l] + numbers[r] == target){
                result[0] = l + 1;
                result[1] = r + 1;
                break;
            }

            if(numbers[l] + numbers[r] > target) r--;
            else l++;
        }

        return result;
    }
}
