package java100.p17;

public class Exam_17 {
    public static void main(String[] args) {
       //기본형타입->8개: 변수 선언과 동시에 값을 입력
        byte b = 10;
        short s=32767;
        int i=2147483647;
        long l= 700000000L;
        float f=9.8f;
        double d=3.14;
        char c='a';
        boolean bl=true;

        //print,println
        System.out.print("안녕하세요");
        System.out.print("모두 안녕");
        System.out.println("홍길동입니다. 나는 학생입니다");

        //printf->지시자를 사용
        //%d(정수),%f(소숫점형식),%c(문자),%s(문자열),%b(불린형),%n(줄바꿈),%o(8진수),%x(16진수)
        System.out.printf("나는 %d살의 대학생입니다. %d,%d,%d,%.1f,%.2f",b,s,i,l,f,d);
        System.out.println();
        System.out.printf("10진수 10은 8진수로는 %o이고, 16진수로는 %x이다",b,b);

    }
}
