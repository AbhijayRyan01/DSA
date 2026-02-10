public class MinRotatedSortedArray_BF{
    public static int findMin(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(arr[i], min);
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }
}