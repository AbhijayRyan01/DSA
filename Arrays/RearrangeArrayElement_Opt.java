public class RearrangeArrayElement_Opt {
    public static int[] RearrangebySign(int[] A){
        int posIndex = 0;
        int negIndex = 1;
        int n = A.length;
        int[] ans = new int[n];
        for(int i=0; i<A.length; i++){
            if(A[i]<0){
                if(negIndex<n){
                    ans[negIndex] = A[i];
                    negIndex+=2;
                }
            }else{
                if(posIndex<n){
                    ans[posIndex] = A[i];
                    posIndex+=2;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Array Initialization
        int[] A = {1, 2, -4, -5};

        int[] ans = RearrangebySign(A);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
