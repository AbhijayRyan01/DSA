public class MissingNumber_Opt {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5};
        int sum2 = 0;
        int n = nums.length;
        int sum1 = n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            sum2 = sum2+nums[i];
        }
        int missingNumber = sum2-sum1;
        System.out.println(missingNumber);
    }
}
