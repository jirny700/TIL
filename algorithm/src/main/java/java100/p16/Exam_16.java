package java100.p16;

public class Exam_16 {
    public static void main(String[] args) {
        //1.
        short a='A';
        System.out.println(a);
        //A를 아스키코드에 대응하는 숫자로 표현시 65가 출력됨. 데이터타입에 char가 아니기 때문.

        //2
        short b=90;
        System.out.println((char)b);//90을 아스키코드표에서 문자형으로 변환시 출력되는 문자가 출력.

        //3
        char c='z';
        System.out.println((short)c);//a(97)+(26-1)
    }
}
