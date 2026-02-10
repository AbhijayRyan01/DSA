public class TwoSumIndex_BF{
    public static int[] TwoSumIndex(int n, int[] arr, int target){
        int[] a = new int[2];
        a[0] = -1;
        a[1] = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] a = TwoSumIndex(n,arr,target);
        System.out.println("This is the answer for variant 2: [" + a[0] + ", " + a[1] + "]");

    }
}
