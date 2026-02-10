public class RearrangeArrayElement_BF {
    public static int[] RearrangebySign(int[] A, int n){
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posIndex = 0;
        int negIndex = 0;
        for(int i=0; i<n; i++){
            if(A[i]>0){
                pos[posIndex++] = A[i];
            }else{
                neg[negIndex++] = A[i];
            }
        }
        for(int i=0; i<n/2; i++){
            A[2*i] = pos[i];
            A[2*i+1] = neg[i];
        }
        return A;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] A = {1, 2, -4, -5};

        int[] ans = RearrangebySign(A, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
