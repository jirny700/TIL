package java100.p46;
//자바의 기본형 타입과 참조형 탑입의 다양한 메서드 호출 방식에 대해서 알기

public class Exam_46 {
    //call by value-->값에 의한 호출
    //메서드로 인자값을 넘길 때 해당 값을 복사하여 넘기는 방식->따라서 sum() 메서드 내부에서는 복사된 값으로 처리를 한다
    public static void sum(int a){
        a = a+400;
        System.out.println(a);
    }

    public static void main(String[] args) {

        //[1]변수 선언 및 메서드 호출
        int a = 100;
        sum(a);

        //[2]출력
        System.out.println(a);
    }
}
