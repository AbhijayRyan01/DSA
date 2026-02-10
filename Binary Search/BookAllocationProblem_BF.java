public class BookAllocationProblem_BF{
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
    public static int allocateBooksBruteForce(){
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
        for(int i=low; i<= high; i++){
            int countStudents = func(arr,i);
            if(countStudents == m){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int result = allocateBooksBruteForce();
        System.out.println(result);
    }
}