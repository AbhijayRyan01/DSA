public class NumberAppearingOne {
    public static int checkNumber(int nums[]) {
        int xorr = 0;
        for(int i=0;i<nums.length;i++){
            xorr = xorr^nums[i];
        }
        return xorr;
    }
    public static void main(String[] args){
        int nums[] = { 1, 1, 2, 3, 3, 4,4 };
        System.out.println(checkNumber(nums))   ;
    }
}
