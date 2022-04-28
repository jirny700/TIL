package java100.p24;

public class Exam_24 {
    public static void main(String[] args) {

    //1. 변수선언
    int hour=10;

    //2. 삼항연산자 테스트==>10보다 작거나 같으면 100을 곱하시오.
    int test = hour<=10 ? hour*100:hour;
    System.out.println(test);

    //3. 삼항연산자를 이용하여 12시보다 작으면 오전, 크면 오후를 출력
    //변수 hour로 출력되지 않는다. 왜냐하면  오전,오후는 문자열이기 때문에!
    String ampm = hour<12?"오전":"오후";
    System.out.println(ampm);
}}
