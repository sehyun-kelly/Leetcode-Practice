import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Object> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char par = s.charAt(i);
            if (par == '(' || par == '[' || par == '{') {
                stack.push(par);
            } else if (!stack.isEmpty()) {
                if (par == ')' && (char) stack.peek() == '(') {
                    stack.pop();
                } else if (par == ']' && (char) stack.peek() == '[') {
                    stack.pop();
                } else if (par == '}' && (char) stack.peek() == '{') {
                    stack.pop();
                } else{
                    stack.push(par);
                }
            } else {
                stack.push(par);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String par = "(])";
        System.out.println(isValid(par));
    }
}
