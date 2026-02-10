package Recursion;

import java.util.*;

public class Print1toN {
    static void printNombor(int i, int n){
        if(i>=n) return;
        System.out.println(i);
        i++;
        printNombor(i+1,n);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printNombor(1,n);
        }
    }
}
