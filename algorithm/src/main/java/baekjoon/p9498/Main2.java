package baekjoon.p9498;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            String[] split = next.split(" ");
            int a = Integer.parseInt(split[0]);
            solution(a);
        }

    }

    private static void solution(int a) {
        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}