public class NthRoot_Opt{
    public static int func(int mid, int n, int m){
        long ans = 1;
        for(int i=0; i<n; i++){
            ans = ans*mid;
            if(ans > m){
                return 2;
            }
        }
        if(ans == m) return 1;
        return 0;
    }
    public static int NthRoot(int n, int m){
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high - low)/2;
            int midS = func(mid, n, m);
            switch (midS) {
                case 1 -> {
                    return mid;
                }
                case 0 -> low = mid + 1;
                default -> high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}