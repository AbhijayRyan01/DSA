public class SecondLargestElement_BeT {
    static private void getElements(int[] arr, int n) {
        if (n < 2) {
            System.out.print(-1 + " " + -1 + "\n");
            return;
        }

        Integer small = null, second_small = null;
        Integer large = null, second_large = null;

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            // For smallest
            if (small == null || num < small) {
                second_small = small;
                small = num;
            } else if ((num != small) && (second_small == null || num < second_small)) {
                second_small = num;
            }

            // For largest
            if (large == null || num > large) {
                second_large = large;
                large = num;
            } else if ((num != large) && (second_large == null || num > second_large)) {
                second_large = num;
            }
        }

        if (second_small == null || second_large == null) {
            System.out.println("No valid second smallest or largest.");
        } else {
            System.out.println("Second smallest is " + second_small);
            System.out.println("Second largest is " + second_large);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getElements(arr, n);
    }
}
