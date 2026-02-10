public class KOKOEatingBananas_BF {
    public static int BananasPerHour(int[] v, int hourly){
        int TotalHours = 0;
        for(int i=0; i<v.length; i++){
            TotalHours += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return TotalHours;
    }
    public static int findMax(int[] v){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<v.length; i++){
            maxi = Math.max(v[i], maxi);
        }
        return maxi;
    }
    public static int minimumRateToEatBananas(int[] v, int h){
        int low = 1;
        int high = findMax(v);
        while(low <= high){
            int mid = low + (high-low)/2;
            int ans = BananasPerHour(v,mid);
            if(ans <= h){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
