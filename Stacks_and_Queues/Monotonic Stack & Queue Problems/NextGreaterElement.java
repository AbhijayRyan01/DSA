import java.util.*;

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }

        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.get(nums1[i]);
        }

        return ans;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = solution.nextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(result));
    }
}
