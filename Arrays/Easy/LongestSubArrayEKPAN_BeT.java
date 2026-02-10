public class LongestSubArrayEKPAN_BeT {
    public static int LongestSubArrayEKPAN(int[] a, int k){
        int n = a.length;
        int len = 0;
        for(int i=0; i<n;i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum+=a[j];
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;

    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        System.out.println(LongestSubArrayEKPAN(a,k));
    }
}
