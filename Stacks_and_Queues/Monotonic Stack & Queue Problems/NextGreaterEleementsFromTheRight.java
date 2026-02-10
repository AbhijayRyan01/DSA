import java.util.*;

class Solution {

    public int[] nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int currEle = arr[i];

            while (!st.isEmpty() && st.peek() <= currEle) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(currEle);
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 3, 2, 4};

        Solution sol = new Solution();
        int[] ans = sol.nextLargerElement(arr);

        System.out.println("The next greater elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
