import java.util.*;

public class GCD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int gcd = 1;
            for(int i = 1; i<n2; i++){
                if(i%n1 == 0 & i%n2 == 0){
                    gcd*=i;
                }
            }
            System.out.println(gcd);
        }
    }
}
