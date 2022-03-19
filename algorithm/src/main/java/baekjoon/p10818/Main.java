package baekjoon.p10818;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner라는 이름의 스캐너 선언
        int size = Integer.parseInt(scanner.nextLine()); // scanncer에서 한줄 입력받기
        String inputNumbers = scanner.nextLine();
        String[] numbersByString = inputNumbers.split(" "); // 10 20 30 40 50

        // 진짜 시작!
        int[] numbers = new int[size]; // == {0, 0, 0, 0, 0}
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(numbersByString[i]);
        }

        solution(numbers);
    }

    private static void solution(int[] numbers) {

    }
}
