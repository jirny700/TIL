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



    }
}
