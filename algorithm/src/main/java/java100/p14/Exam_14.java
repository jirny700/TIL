package java100.p14;

public class Exam_14 {
    public static void main(String[] args) {
        //변수선언
        int a; //정수가 저장될 변수 이름을 a로 만들어라
        int b;int c=90;
        double d;//실수가 저장될 변수 이름을 d로 만들어라
        char e;//문자가 저장될 변수 이름을 e로 만들어라

        //선언된 변수에 값을 대입: 초기화
        a=10;
        d=3.14;//정수 10을 입력했다면 10.0으로 출력
        e='a'; //문자 하나에 쌍따옴표를 하면 에러메시지

        //출력
        System.out.println(a);
        //System.out.println(b); //실행시 에러가 나는 이유는 초기화를 하지 않았기 떄문
       System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
