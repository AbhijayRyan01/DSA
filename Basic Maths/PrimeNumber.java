import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            for(int i = 1; i<n; i++){
                if(n%i==0){
                    count++;
                }
            }
            System.out.println(count);
            if(count==1){
                System.out.println("Pallindrome Number");
            }else{
                System.out.println("Not a Pallindrome Number");
            }
        }
    }
}
