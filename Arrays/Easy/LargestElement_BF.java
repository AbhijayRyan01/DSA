import java.util.*;

public class LargestElement_BF{
    public static void main(String[] args){
        int[] arr1 = {7,4,5,6,9,5,8};
        System.out.println("Largest Element is: "+FindLargeElem(arr1));
        int[] arr2 = {4,5,8,9,6,2,0,4};
        System.out.println("Largest Element is: "+FindLargeElem(arr2));
    }

    static int FindLargeElem(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}