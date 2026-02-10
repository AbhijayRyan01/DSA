import java.util.*;

public class DivisiorsOfANumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                if(n%i==0){
                    System.out.println(i+" is a divisor");
                }else{
                    System.out.println("Not a divisor");
                }
            }
        }
    }
}
