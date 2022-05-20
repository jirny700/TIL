package java100.p47;

public class Exam_47 {
    public static void sum(Exam_47 a){
        System.out.println("sum() 메서드 안에서 a값 출력->"+ a);
    }
    public static void main(String[] args) {
        //[1]변수 선언 및 메서드 호출
        //Wrapper 클래스의 Integer 클래스 타입으로 변수 a 선언하고, new로 객체를 생성하여 해당 주소 값을 메서드 보낸다.
        Exam_47 a = new Exam_47();
        sum(a);
        System.out.println(a);
    }
}
