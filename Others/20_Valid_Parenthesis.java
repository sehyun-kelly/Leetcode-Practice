/** My Solution - 91.68%, 32.91% */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '[') stack.push(curr);
            else{
                if(!stack.isEmpty() && 
                ((curr == ')' && stack.peek() == '(') 
                || (curr == '}' && stack.peek() == '{')
                || (curr == ']' && stack.peek() == '['))){
                    stack.pop();
                }else{
                    stack.push(curr);
                }
            }
        }

        return stack.isEmpty();
    }
}
