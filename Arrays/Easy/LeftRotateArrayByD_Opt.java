public class LeftRotateArrayByD_Opt {
    private static void reverseArr(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArr(int[] arr, int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,arr.length-1);
        reverseArr(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {7,5,3,9,1,2,8,6,4};
        rotateArr(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
