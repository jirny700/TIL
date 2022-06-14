package me.yejin.baseball;

import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {

        Random random = new Random();
        int[] baseballAnswer = new int[4];
        for (int i = 0; i < 4; i++) {
            baseballAnswer[i] = random.nextInt(10);
            for (int j = 0; j < i; j++) {
                if(baseballAnswer[i]==baseballAnswer[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < baseballAnswer.length; i++) {
            System.out.println(baseballAnswer[i]);
        }

        Scanner userEnterNumber = new Scanner(System.in);

           int oneBase;
           int twoBase;
           int threeBase;
           int fourBase;

        System.out.println("숫자 4개를 입력하세요(숫자 하나 입력 후 띄어쓰기 하세요).");
        oneBase = userEnterNumber.nextInt();
        twoBase = userEnterNumber.nextInt();
        threeBase = userEnterNumber.nextInt();
        fourBase = userEnterNumber.nextInt();

        System.out.printf("당신이 입력한 숫자는 %d, %d, %d , %d 입니다.", oneBase,twoBase,threeBase,fourBase);


    }
}
