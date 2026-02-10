public class SmallestDivisorGivenThreshold_BF {
    public static int findMax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public static int smallestDivisor(int[] arr, int limit){
        int max = findMax(arr);
        for(int d=1; d <= max; d++){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum += Math.ceil((double)(arr[i]) / (double)(d));
            }
            if(sum <= limit){
                return d;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
