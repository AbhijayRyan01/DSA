public class QuickSort{
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i  = low;
        int j = high;
        while(i<j){
            while(i<=high-1 && arr[i]<=pivot){
                i++;
            }
            while(j>=low+1 && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pIndex = partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr = {7,5,6,9,8,3};
        int n = arr.length;
        System.out.println("Before Quick Sort:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr,0,n-1); // calling the public sort method
        System.out.println("After Quick Sort:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}