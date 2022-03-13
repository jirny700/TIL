package baekjoon.p2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String[] split = next.split(" ");
        int a = Integer.parseInt(split[0]);
        solution(a);
    }

    private static void solution(int a){
        if((a%4==0 && a%100!=0)||a%400==0){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}
