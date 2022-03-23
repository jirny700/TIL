package opentutorials.constructor;

 class Calculator {
    int left, right;

    public Calculator(int left, int right) { //생성자, 어떤 일을 할때 반드시 먼저 수행되어야 하는 작업을 생성자로 구현함. 생성자는 클래스 이름과 동일하게 생성.
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(10, 20);// 출력할때 생성자에 들어가는 인자를 넣음으로서 사용자로 하여금 사용법 숙지에 대한 부담을 줄임
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}
