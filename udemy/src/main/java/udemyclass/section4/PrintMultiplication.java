package udemyclass.section4;

public class PrintMultiplication {
    static void printMultiplication(int n){
        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%d * %d = %d", n,i,n*i).println();
        }
    }

    public static void main(String[] args) {
        printMultiplication(4);
    }
}
