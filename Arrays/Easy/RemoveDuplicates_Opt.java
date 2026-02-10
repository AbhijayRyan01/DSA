public class RemoveDuplicates_Opt {
    static int removeDuplicate(int[] arr, int n){
        int i = 0;
        for(int j = 1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr = {2,2,3,3,4,4,5,5,6,6};
        int n = 8;
        int k = removeDuplicate(arr,n);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
