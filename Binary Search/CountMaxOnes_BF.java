public class CountMaxOnes_BF{
    public static int rowWithMax1s(int[][] matrix, int n, int m){
        int cnt_max = 0;
        int index = -1;
        for(int i=0; i<n; i++){
            int cnt_ones = 0;
            for(int j=0; j<m; j++){
                cnt_ones+= matrix[i][j];
            }
            if(cnt_ones>cnt_max){
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("The row with the maximum number of 1's is: " + rowWithMax1s(matrix, n, m));
    }
}