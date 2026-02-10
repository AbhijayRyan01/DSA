import java.util.Arrays;

public class CheckSort_BF {
    static boolean checkSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {75,95,35,15,45,65};
        int n = 6;
        System.out.println(checkSort(arr,n));
        Arrays.sort(arr);
        System.out.println(checkSort(arr,n));
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
