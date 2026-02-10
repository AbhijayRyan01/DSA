public class LargestElement_Opt{
    public static void main(String[] args) {
        int[] arr = {77,55,335,69,892,81,24,72};
        System.out.println("The largest element is: "+FindLarge(arr));
    }
    static int FindLarge(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}