import java.util.*;

class Solution {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {

                if (Math.abs(st.peek()) < Math.abs(a)) {
                    st.pop();
                    continue;
                } else if (Math.abs(st.peek()) == Math.abs(a)) {
                    st.pop();
                }

                a = 0;
                break;
            }

            if (a != 0) {
                st.push(a);
            }
        }

        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] asteroids = {5, 10, -5};

        Solution sol = new Solution();
        int[] result = sol.asteroidCollision(asteroids);

        System.out.println("Asteroids after collision:");
        System.out.println(Arrays.toString(result));
    }
}
