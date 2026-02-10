import java.util.Arrays;

public class CheckSort_Opt {
    public static boolean checkSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {85,65,25,45,15,35};
        int n = 6;
        System.out.println(checkSort(arr,n));
        Arrays.sort(arr);
        System.out.println(checkSort(arr,n));
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
