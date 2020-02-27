import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char character: s.toCharArray()) {
            if(character == '(')
                stack.push(')');
            else if (character == '{')
                stack.push('}');
            else if (character == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != character)
                return false;
        }

        return stack.isEmpty();
    }
}
