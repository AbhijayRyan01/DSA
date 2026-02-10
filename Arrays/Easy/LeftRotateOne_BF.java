public class LeftRotateOne_BF {
    public static void LeftRotateOne(int[] arr, int n){
        int[] temp = new int[n];
        temp[n-1]=arr[0];
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {75,95,35,15,25,65,85,45};
        int n = arr.length;
        LeftRotateOne(arr,n);
    }
}
