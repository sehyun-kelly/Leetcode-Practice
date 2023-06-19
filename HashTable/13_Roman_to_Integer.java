/** My Solution - 50.99%, 51.34% */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int index = 0;
        int res = 0;

        while(index < s.length()){
            char curr = s.charAt(index);
            if(index != s.length() - 1){
                char next = s.charAt(index + 1);
                if((curr == 'I' && (next == 'V' || next == 'X'))
                    || (curr == 'X' && (next == 'L' || next == 'C'))
                    || (curr == 'C' && (next == 'D' || next == 'M'))
                ){
                    res += romans.get(next) - romans.get(curr);
                    index += 2;
                }else{
                    res += romans.get(curr);
                    index++;
                }
            }else{
                res += romans.get(curr);
                index++;
            }
        }

        return res;
    }
}

/** Leetcode solution - 100%, 69.42% */
class Solution {
    public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
