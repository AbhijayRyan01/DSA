public class StockBuySell_BF{
    public static int maxProfit(int[] arr){
        int maxPro = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]>arr[i]){
                    maxPro = Math.max(maxPro, arr[j]-arr[i]);
                }
            }
        }
        return maxPro;
    }
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}