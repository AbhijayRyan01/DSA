public class LongestSubArrayEK_BF{
    public static int getLongestSubarray(int []a, int k){
        int n = a.length;
        int len = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int s = 0;
                for(int K=i;K<=j;K++){
                    s+=a[K];
                }
                if (s==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}