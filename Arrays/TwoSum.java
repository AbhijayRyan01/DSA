
import java.util.Arrays;

public class TwoSum {
    public static String twoSum(int n, int[] a, int target){
        Arrays.sort(a);
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = a[left] + a[right];
            if(sum == target){
                return "Yes";
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        int n = 5;
        int[] a = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, a,target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
