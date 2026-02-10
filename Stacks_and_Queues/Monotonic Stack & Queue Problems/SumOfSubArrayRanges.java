class Solution {

    public int[] findNSE(int[] nums) {
        int n = nums.length;
        int[] NSE = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            NSE[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return NSE;
    }

    public int[] findPSE(int[] nums) {
        int n = nums.length;
        int[] PSE = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            PSE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return PSE;
    }

    public int[] findNGE(int[] nums) {
        int n = nums.length;
        int[] NGE = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            NGE[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return NGE;
    }

    public int[] findPGE(int[] nums) {
        int n = nums.length;
        int[] PGE = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            PGE[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return PGE;
    }

    public long sumMax(int[] nums){
        int[] nge = findNGE(nums);
        int[] pge = findPGE(nums);
        long total = 0;

        for(int i = 0; i < nums.length; i++){
            long left = i - pge[i];
            long right = nge[i] - i;
            total += left * right * nums[i];
        }
        return total;
    }

    public long sumMin(int[] nums){
        int[] nse = findNSE(nums);
        int[] pse = findPSE(nums);
        long total = 0;

        for(int i = 0; i < nums.length; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total += left * right * nums[i];
        }
        return total;
    }

    public long subArrayRanges(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }
}
