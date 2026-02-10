public class StockBuySell {
    public static int maxProfit(int[] arr){
        int minPro = Integer.MAX_VALUE;
        int maxPro = 0;
        for(int i=0; i<arr.length;i++){
            minPro = Math.min(minPro,arr[i]);
            maxPro = Math.max(maxPro,arr[i]-minPro);
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}
