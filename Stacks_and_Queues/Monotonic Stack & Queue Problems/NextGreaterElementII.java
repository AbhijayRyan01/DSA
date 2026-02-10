import java.util.*;

class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * size - 1; i >= 0; i--) {
            int idx = i % size;
            int currEle = nums[idx];

            while (!st.isEmpty() && st.peek() <= currEle) {
                st.pop();
            }

            if (i < size) {
                ans[idx] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(currEle);
        }
        return ans;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 1};

        int[] result = solution.nextGreaterElements(nums);

        System.out.println("Next Greater Elements (Circular Array):");
        System.out.println(Arrays.toString(result));
    }
}
