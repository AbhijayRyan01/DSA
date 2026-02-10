public class LeadersInArray_Opt {
    public static int[] printLeadersArray(int[] arr, int n) {
        int[] temp = new int[n]; // max possible size
        int count = 0;

        int max = arr[n - 1];
        temp[count++] = max;

        for (int i = n - 2; i >= 0; i--) { 
            if (arr[i] > max) {
                max = arr[i];
                temp[count++] = max;
            }
        }
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = temp[count - i - 1];
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {10, 22, 12, 3, 0, 6};

        int[] ans = printLeadersArray(arr, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
