public class RotateMatrix_Opt {
    public static int[][] rotate(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }

    }
}
