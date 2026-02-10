import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int revNumber = 0;
            while(n>0){
                int lastDigit = n%10;
                revNumber = (revNumber*10) + lastDigit;
                n = n/10;
            }
            System.out.println(revNumber);
        }
    }
}
