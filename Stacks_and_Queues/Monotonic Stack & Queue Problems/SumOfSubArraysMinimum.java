import java.util.*;

class Solution {

    public int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    public int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] NSE = findNSE(arr);
        int[] PSE = findPSE(arr);

        int total = 0;
        int n = arr.length;
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < n; i++) {
            int left = i - PSE[i];
            int right = NSE[i] - i;
            total = (int) (total + (1L * left * right * arr[i]) % mod) % mod;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        Solution sol = new Solution();
        int result = sol.sumSubarrayMins(arr);

        System.out.println("Sum of Subarray Minimums: " + result);
    }
}
