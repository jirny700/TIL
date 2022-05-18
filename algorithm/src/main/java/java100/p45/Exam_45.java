package java100.p45;
//static 선언이 안되어 있어도 메서드를 사용하는 방법에 대해서 코드를 구현하기.
//static 선언이 없는 메서드를 사용하기 위해서는 객체를 생성후 사용해야 한다.
//class와 객체에 대한 학습 필요.

public class Exam_45 {
    public void helloWorld(){
        System.out.println("hello~world!");
    }
    public static void main(String[] args) {
        //[1]메서드 호출
        //helloWorld();//메인 메서드는 static메서드만 호출할 수 있기 때문에 에러.

        //[2]객체 생성 후 메서드 호출
        Exam_45 jes = new Exam_45();
        jes.helloWorld();
    }
}
