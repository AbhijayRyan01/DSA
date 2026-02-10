public class PascalTriangle_Opt {

    public static int[] generateRow(int row) {
        int[] ansRow = new int[row];
        long ans = 1;
        ansRow[0] = 1; // First element is always 1

        // Calculate the rest of the elements
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow[col] = (int) ans;
        }
        return ansRow;
    }

    public static int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];

        for (int row = 1; row <= n; row++) {
            ans[row - 1] = generateRow(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] ans = pascalTriangle(n);

        for (int[] an : ans) {
            for (int j = 0; j < an.length; j++) {
                System.out.print(an[j] + " ");
            }
            System.out.println();
        }
    }
}
