public class TwoSum_BF {
    public static String TwoSum(int n, int[] arr, int target){
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    return "Yes";
                }
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        System.out.println(TwoSum(n,arr,target));
    }
}
