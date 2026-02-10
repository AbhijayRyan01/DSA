import java.util.Stack;

class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek(); // ensure output has the correct front element
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        System.out.println(queue.empty()); // true

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.peek());  // 10
        System.out.println(queue.pop());   // 10
        System.out.println(queue.peek());  // 20
        System.out.println(queue.pop());   // 20
        System.out.println(queue.pop());   // 30

        System.out.println(queue.empty()); // true
    }
}
