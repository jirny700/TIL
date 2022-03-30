package lecture220329;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
        //메모리상에 vm1,vm2이라는 메모리가 생겼다.
        String product = vm1.pushProductButton(100);
        System.out.println(product);
    }
}
//static이 붙은 메소드는 클래스 메소드
//static은 인스턴스를 만들이 않아도 사용 가능하다->사용가능하다는 것은 메모리에 올라가있는 것.
//메소드->기능 행위 ex)동전(인스턴스)을 넣는다(메소드)
//VendingMachineMain 클래스는 VendingMachine클래스가 있어야 존재한다->의존한다
