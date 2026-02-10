import java.util.Stack;

class MinStack {
    Stack<Long> st;
    long mini;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        long x = val;

        if (st.isEmpty()) {
            mini = x;
            st.push(x);
        } else {
            if (x >= mini) {
                st.push(x);
            } else {
                st.push(2 * x - mini);
                mini = x;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();
        if (x < mini) {
            mini = 2 * mini - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();
        if (x < mini) return (int) mini;
        return (int) x;
    }

    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int) mini;
    }
}

public class Main {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println(minStack.getMin()); // 2
        System.out.println(minStack.top());    // 2

        minStack.pop(); // removes 2
        System.out.println(minStack.getMin()); // 3
        System.out.println(minStack.top());    // 7

        minStack.pop(); // removes 7
        System.out.println(minStack.getMin()); // 3

        minStack.pop(); // removes 3
        System.out.println(minStack.getMin()); // 5
        System.out.println(minStack.top());    // 5
    }
}
