public class LeftRotateArrayByD_BF{
    public static void rotateOne(int[] arr){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void rotate(int[] arr,int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        for(int i=0;i<k;i++){
            rotateOne(arr);
        }
    }
    public static void main(String[] args){
        int[] arr = {7,5,3,6,9,1,2,4};
        rotate(arr,8);
        for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
        }
    }
}