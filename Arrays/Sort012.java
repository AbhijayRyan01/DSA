public class Sort012 {
    public static void sortArray(int[] arr,int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            switch (arr[mid]) {
                case 0 ->                     {
                        int temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                        low++;
                        mid++;
                    }
                case 1 -> mid++;
                default ->                     {
                        int temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;
                        high--;
                    }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1};
        int n = arr.length;
        sortArray(arr,n);
        System.out.println("After sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
