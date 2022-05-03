package java100.p34;

import java.util.Arrays;
public class Exam_34 {
    //배열 복사하기:
    //arraycopy()메서드 사용->사용법: System.arraycopy(원본배열명,원본배열의 시작인덱스,복사배열명, 복사배열의 시작인덱스, 길이);
    public static void main(String[] args) {
        //1.배열 선언
        int[] ar = {1,2,3,4,5};
        int[] ar2 = {1,2,3,4,5,6,7,8,9,10};

        //2.배열 복사하기->System.arraycopy()
        System.arraycopy(ar,2,ar2,3,3);
        System.out.println(Arrays.toString(ar2));
    }
}
