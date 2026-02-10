public class LeadersInArray_BF {
    public static int[] printLeadersArray(int[] arr, int n){
        int count = 0;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            boolean Leaders = true;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    Leaders = false;
                    break;
                }
            }
            if(Leaders){
                temp[count] = arr[i];
                count++;
            }
        }
        int[] ans = new int[count];
        System.arraycopy(temp, 0, ans, 0, count);
        return ans;
    }
    public static void main(String[] args){
        int n = 6;
        int[] arr = {10, 22, 12, 3, 0, 6};

        int[] ans = printLeadersArray(arr, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
