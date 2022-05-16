package java100.p43;

public class Exam_43 {
    public static int returnMethod(){
        int a=100;
        a*=100;
        return a; //10000
    }
    public static void main(String[] args) {
        // 반환값o -인자값x
        // 반환값이 있다는 것음 메서드 호출에 따른 리턴값이 있는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
        int rst;
        rst = returnMethod();

        //출력
        System.out.println("메서드 호출에 따라 리턴된 값은"+rst);
    }
}
