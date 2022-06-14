package me.yejin.baseball;

import java.util.Random;

public class NumberBaseball {
    public static void main(String[] args) {

//        int oneBase = (int)Math.random()*10;
//        int twoBase = (int)Math.random()*10;
//        int threeBase = (int)Math.random()*10;
//        int fourBase = (int)Math.random()*10;
        Random random = new Random();
        int[] baseballAnswer = new int[4];
        for (int i = 0; i < 4; i++) {
            baseballAnswer[i] = random.nextInt(10);
            System.out.println(baseballAnswer[i]);
        }



    }
}
