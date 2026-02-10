

// OPTIAMAL SOLUTION


// public class DutchNationalFlag {
//     public static void main(String[] args) {
//         int arr[] = {2,0,2,1,1,0,1,2,0,0};
//         int n = arr.length;
//         int count0=0;
//         int count1=0;
//         int count2=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 count0++;
//             }
//             if(arr[i]==1){
//                 count1++;
//             }
//             if(arr[i]==2){
//                 count2++;
//             }
//         }
//         System.out.println(count0);
//         System.out.println(count1);
//         System.out.println(count2);
//         for(int i=0;i<count0;i++){
//             System.out.print("0");
//         }
//         for(int i=0;i<count1;i++){
//             System.out.print("1");
//         }
//         for(int i=0;i<count2;i++){
//             System.out.print("2");
//         }
//     }
// }



// OPTIMIZED SOLUTION


public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0};
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                default -> {
                    swap(arr, mid, high);
                    high--;
                }
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // ✅ Proper swap method for array elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

