package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char popChar = stack.pop();
                if (current == '}' && popChar != '{') {
                    return false;
                }
                if (current == ')' && popChar != '(') {
                    return false;
                }
                if (current == ']' && popChar != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
