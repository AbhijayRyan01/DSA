package Recursion;

public class PrintNames {
    static int cnt = 0;
    static void printNaam(){
        if (cnt==4) return;
        System.out.println("Abhijay_Ryan");
        cnt++;
        printNaam();
    }
    public static void main(String[] args) {
        printNaam();
    }
}
