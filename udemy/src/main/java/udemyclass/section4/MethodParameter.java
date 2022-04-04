package udemyclass.section4;

public class MethodParameter {
    static void printNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
       static void printSquareNumber(int m){
            for (int j = 1; j <= m; j++) {
                System.out.println(j*j);
            }
        }

    public static void main(String[] args) {
        printNumber(7);
        printSquareNumber(7);
    }
    }

