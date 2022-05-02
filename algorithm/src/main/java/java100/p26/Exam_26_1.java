package java100.p26;

public class Exam_26_1 {
    public static void main(String[] args) {
       //변수선언
        int number = 1;

        //반복문을 돌면서 홀수,짝수 체크
        while (number <= 30) {
            //짝수이면 출력
            if (number % 2 == 0) {
                System.out.println(number);
            }
            //반복문을 빠져나오기 위해서 number값을 반복떄마다 증가.
            number++;
        }
    }
}

