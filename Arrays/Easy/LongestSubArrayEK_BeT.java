public class LongestSubArrayEK_BeT {
    public static int getLongestSubarray(int[] a, int k){
        int n = a.length;
        int len = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(k==sum){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
