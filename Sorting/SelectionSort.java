public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {4,7,8,5,6,3,2,0,1,9};
        for(int i=0;i<arr.length-1;i++){
            int mini = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mini]>arr[j]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
