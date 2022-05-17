package java100.p44;
//소문자 문자열을 입력시 대문자로 변환하는 메서드를 생성.

public class Exam_44 {
    public static String capitalMethod(String b){
        String c = b.toUpperCase();
        return  c;
    }
    public static void main(String[] args) {
        //반환값o -인자값o
        //반환값이 있다는 것은 메서드 호출에 따라 리턴되는 값이 있다는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
        //문자열 변수 선언.
        String a = capitalMethod("korea");
        System.out.println(a);
    }
}
