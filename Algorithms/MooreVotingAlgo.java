public class MooreVotingAlgo {
    public static int majorityElement(int[] arr){
        int n = arr.length;
        int cnt = 0;
        int el = 0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt = 1;
                el = arr[i];
            }else if(el == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        int cnt1 = 0;

        for(int i=0; i<n; i++){
            if(el==arr[i]){
                cnt1++;
            }
        }

        if(cnt1>n/2){
            return el;
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
