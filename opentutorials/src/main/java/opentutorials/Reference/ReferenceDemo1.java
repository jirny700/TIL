package opentutorials.Reference;

class A {
    public int id;
    A(int id) {
        this.id = id;
    }
}

public class ReferenceDemo1 {
    public static void runValue() {
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, " + a);
    }
//1이 출력됨. 값을 2로 변경한 것은 변수 b이기 때문에 변수 a에 담겨있는 값은 그대로임.

    public static void runReference() {
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runReference, " + a.id);
    }
    //변수 b에 담긴 인스턴스의 id 값을 2로 변경했을 뿐인데 a.id의 값도 2가 된 것이다. 이것은 변수 b와 변수 a에 담긴 인스턴스가 서로 같다는 것을 의미하다- 참조(reference)

    public static void main(String[] args) {
        runValue();
        runReference();
    }

}
