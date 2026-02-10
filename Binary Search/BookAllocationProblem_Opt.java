public class BookAllocationProblem_Opt {
    public static int func(int[] arr, int pages){
        int students = 1;
        int pagesStudent = 0;
        for(int i=0; i<arr.length; i++){
            if(pagesStudent + arr[i] <= pages){
                pagesStudent += arr[i];
            }else{
                students+=1;
                pagesStudent=arr[i];
            }
        }
        return students;
    }
    public static int allocateBooksOpt(){
        int[] arr = {25,46,28,49,24};
        int maxi = arr[0];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(arr[i],maxi);
            sum += arr[i];
        }
        int low = maxi;
        int high = sum;
        int m = 4;
        while(low <= high){
            int mid = low + (high-low)/2;
            int countPages = func(arr, mid);
            if(countPages > m){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
     public static void main(String[] args) {
        int result = allocateBooksOpt();
        System.out.println(result);
    }
}
