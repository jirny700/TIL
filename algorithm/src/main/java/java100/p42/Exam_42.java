package java100.p42;

public class Exam_42 {
    public static void plusMethod(int a,int b){
       //단순출력
        System.out.printf("인자로 넘겨받은 2개의 값은 %d와 %d 입니다",a,b);
        //연산출력
        int plus = a + b;
        System.out.println(plus);
    }
    public static void main(String[] args) {
        //반환값x -인자값o
        //메서드가 받는 인자값이 있다는 것은 호출부에서 파라미터 값을 넘긴다는 뜻.
        int a =100, b = 200;
        plusMethod(a,b);
    }
}
