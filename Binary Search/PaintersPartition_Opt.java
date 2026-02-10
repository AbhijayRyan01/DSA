class Painters_Partition_Opt {
    public static int countDays(int[] arr, int day){
        int painters = 1;
        int paint = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] + paint <= day){
                paint += arr[i];
            }else{
                painters+=1;
                paint = arr[i];
            }
        }
        return painters;
    }
    public static int minTime(int[] arr, int k) {
        // code here
        int ans = -1;
        if(arr.length == k){
            return -1;
        }
        int maxi = arr[0];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(maxi,arr[i]);
            sum += arr[i];
        }
        int low = maxi;
        int high = sum;
        while (low <= high){
            int mid = low + (high-low)/2;
            int days = countDays(arr, mid);
            if(days > k){
                low = mid+1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}