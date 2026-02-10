import java.util.*;

public class SingleElement_BF {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of the array.
        if (n == 1)
            return arr.get(0);

        for (int i = 0; i < n; i++) {
            // Check for first index:
            if (i == 0) {
                if (!arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
            // Check for last index:
            else if (i == n - 1) {
                if (!arr.get(i).equals(arr.get(i - 1)))
                    return arr.get(i);
            } else {
                if (!arr.get(i).equals(arr.get(i - 1)) && !arr.get(i).equals(arr.get(i + 1)))
                    return arr.get(i);
            }
        }

        // Dummy return statement:
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
}