public class Solution {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
                if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]); // This part makes the code most optimised.
                break;
            }
                if(nums[low] <= nums[mid]){
                    ans = Math.min(ans,nums[low]);
                    low = mid + 1;
                }else{
                    ans = Math.min(ans,nums[mid]);
                    high = mid - 1;
                }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(nums);
        System.out.println("The minimum element is: " + ans );
    }
} 