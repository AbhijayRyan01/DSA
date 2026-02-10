public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 1, 0, 8, 7, 9};
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.err.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
