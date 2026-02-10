public class SecondLargestElement_Opt{
    public static void main(String[] Args){
        int n = 6;
        int[] arr = {45,85,96,36,20,12};
        int max1=arr[0];
        int max2=arr[1];
        if(max1<max2){
                max1=arr[1];
                max2=arr[0];
            }else{
                max2=arr[1];
                max1=arr[0];
            }
        for(int i=2;i<n;i++){
            if(arr[i] > max1){
                max2=max1;
                max1=arr[i];
            }
            if(arr[i] > max2 && arr[i]!=max1){
                max2 = arr[i];
            }
        }
        System.out.println("The largest number is: "+max1);
        System.out.println("The second largest number is: "+max2);
    }
}