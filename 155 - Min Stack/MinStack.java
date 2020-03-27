import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack, minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(final int x) {
        if (minStack.isEmpty() || minStack.peek() >= x)
            minStack.push(x);

        stack.push(x);
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
