import java.util.*;

class Solution {

    public int trap(int[] height) {
        int l = 0;
        int n = height.length;
        int r = n - 1;
        int total = 0;
        int lmax = 0;
        int rmax = 0;

        while (l < r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if (lmax < rmax) {
                total += lmax - height[l];
                l++;
            } else {
                total += rmax - height[r];
                r--;
            }
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        Solution sol = new Solution();
        int result = sol.trap(height);

        System.out.println("Total trapped rain water: " + result);
    }
}
