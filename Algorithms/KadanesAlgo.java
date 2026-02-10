public class KadanesAlgo {
    public static int maxSubarraySum(int[] arr, int n){
        int sum = arr[0];
        int maxsum = arr[0];
        for(int i=0; i<n;i++){
            if(sum>0){
                sum = sum + arr[i];
            }else{
                sum = arr[i];
            }
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
