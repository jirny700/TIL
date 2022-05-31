package java100.p82;
//내장된 메서드를 사용하여 학생들의 성적을 꼴찌부터 1등까지 나열하기
//오름차순으로 정렬한다.

import java.util.Arrays;

public class Exam_82 {
    public static void main(String[] args) {

        //[1]배열선언->성적배열
        int[] scores = {88, 55, 39, 100, 90, 100, 98, 67};

        //[2]성적배열->오름차순 정렬->Arrays.sort(배열명);->오름차순이 기본정렬->import 필요
        //클래스 메서드로써 Arrays 클래스의 인스턴스 생성없이 바로 사용 가능.
        System.out.print("정렬 들어가기 전=");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        //[3]오름차순 정렬
        Arrays.sort(scores);

        System.out.println("정렬한 후=");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
