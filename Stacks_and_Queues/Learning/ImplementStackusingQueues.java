import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        System.out.println(stack.empty()); // true

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());   // 3
        System.out.println(stack.pop());   // 3
        System.out.println(stack.top());   // 2
        System.out.println(stack.pop());   // 2
        System.out.println(stack.pop());   // 1

        System.out.println(stack.empty()); // true
    }
}
