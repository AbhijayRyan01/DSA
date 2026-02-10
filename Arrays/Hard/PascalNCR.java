public class PascalNCR{
    public static long ncr(int n, int r){
        long res = 1;
        for(int i=0; i<r; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
    public static int pascalTriangle(int row, int col){
        int element = (int)ncr(row-1,col-1);
        return element;
    }
    public static void main(String[] args){
        int row = 5;
        int col = 3;
        int element = pascalTriangle(row,col);
        System.out.println("The element at position (r,c) is: " + element);
    }
}