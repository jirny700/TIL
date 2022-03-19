package opentutorials.claculator;

class Calculator { //클래스 : 설계도, 사용법
    int left, right;

    public void setOprands(int left, int right) { //메소드
        this.left = left;
        this.right = right;
    }

    public void sum() {//메소드
        System.out.println(this.left + this.right);
    }

    public void avg() {//메소드
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo4 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();//인스턴스 : 우항의 객체를 c1이라는 변수에 담는다. 칼큘레이터는 사용자 정의 데이터 타입.
        c1.setOprands(10, 20);//메소드의 인자
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }

}
