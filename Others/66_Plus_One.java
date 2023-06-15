/** My Solution - 100%, 35.35% */

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len - 1] != 9){
            digits[len - 1] = digits[len - 1] + 1;
            return digits;
        }

        ArrayList<Integer> plus = new ArrayList<>();
        int counter = 1;
        
        for(int i = len - 1; i >= 0; i--){
            int curr = counter + digits[i];
            plus.add(curr % 10);
            counter = curr / 10;
        }
        if(counter != 0) plus.add(counter);

        int[] res = new int[plus.size()];
        for(int i = 0; i < plus.size(); i++){
            res[plus.size() - 1 - i] = plus.get(i);
        }

        return res;

    }
}
