import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "({[]})";
        String s4 = "([)]";

        System.out.println(solution.isValid(s1)); // true
        System.out.println(solution.isValid(s2)); // false
        System.out.println(solution.isValid(s3)); // true
        System.out.println(solution.isValid(s4)); // false
    }
}
