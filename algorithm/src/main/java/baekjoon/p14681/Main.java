package baekjoon.p14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        solution(a, b);
    }

    private static void solution(int a, int b) {
        if (a > 0) {
            if (b > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (a < 0) {
                if (b > 0) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
        }
    }
}
