public class LeftRotateOne_Opt {
    public static void LeftRotateOne(int[] arr, int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {75,95,35,15,25,65,85,45};
        int n = arr.length;
        LeftRotateOne(arr,n);
    }
}
 