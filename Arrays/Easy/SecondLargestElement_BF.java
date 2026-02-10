import java.util.*;

public class SecondLargestElement_BF {
    public static void main(String[] args) {
        int[] arr = {78,5,6,96,20,14,36,98};
        int n = arr.length;
        System.out.println("The second largest element in the Array is: "+FindSecond(arr,n));
    }
    static int FindSecond(int[] arr,int n){
        if(n==0 || n==1){
		    System.out.print(-1);
		    System.out.print(" ");
		    System.out.print(-1);
		    System.out.print("\n");
	    }
        Arrays.sort(arr);
        return arr[n-2];
    }
}
