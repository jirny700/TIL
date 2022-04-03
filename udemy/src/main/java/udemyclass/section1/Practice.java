package udemyclass.section1;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 6, i, 6 * i).println();
        }

        for (int j = 1; j <= 10; j++) {
            System.out.printf("%d * %d = %d", 7, j, 7 * j).println();
        }


        for (int k = 1; k <= 20; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }


            for (int l = 1; l <=10 ; l++) {
                System.out.printf("%d",(2*l)*(2*l)).println();
            }

        }

    }
}
