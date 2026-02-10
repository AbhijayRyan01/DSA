public class MergeSort{
    private static void Merge(int[] arr, int low, int midi, int high){
        int left = low;
        int right = midi+1;
        int[] temp = new int[high - low + 1];
        int k = 0;
        while(left<=midi && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=midi){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int midi = (low + high)/2;
        mergeSort(arr,low,midi);
        mergeSort(arr,midi+1,high);
        Merge(arr,low,midi,high);
    }
    public static void main(String[] args){
        int[] arr = {7, 5, 2, 3, 6, 9 };
        int n = 6;
        System.out.println("Array before Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr,0,n-1);
        System.out.println("Array after Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}