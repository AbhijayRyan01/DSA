public class LongestSubArrayEKPAN_BF {
    public static int LongestSubArrayEKPAN(int[] a, int k){
        int n = a.length;
        int len = 0;
        for(int i=0 ; i<n; i++){
            for(int j=i; j<n;j++){
                int sum = 0;
                for(int K=i;K<=j;K++){
                    sum+=a[K];
                }
                if(sum==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] a = { -1, 1, 1};
        int k = 1;
        System.out.println(LongestSubArrayEKPAN(a,k));
    }
}
