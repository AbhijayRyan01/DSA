public class LinearSearch_Opt {
    public static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {75,85,95,15,25,35};
        System.out.println(linearSearch(arr,69));
        System.out.println(linearSearch(arr,35));
    }
}
