package Recursion;

public class Sum {
    static int sum=0;
    static void Gun(int i ,int n){
        if(i>n) return;
        System.out.println(sum);
        sum+=i; 
        Gun(i+1,n);
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        Gun(i,n);
    }
}
 