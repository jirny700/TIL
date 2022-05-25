package java100.p72;
//다형성(polymorphism)에 대해서 개념 알기.

//[1]다형성이란?
//다형성이란 다양한 형태 또는 특성을 가진다는 의미.
//자바와 같은 객체 지향 언어에서의 의미는 부모 클래스를 상속받은 자식 클래스의 인스턴스가 부모의 객체로도 사용되고,
//뿐만 아니라, 자식 클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.

//[2]예시
//부모 클래스 Bird가 있고, 이를 상속받은 Parrot이 있다고 가정.
//이떄, "앵무새가 말을하네","새가 말을하네" 둘다 이상하지 않다.

//[3]결론
//정리하면, 하위 클래스의 인스턴스(객체) 보다 위인 상위 클래스의 인스터스(객체)로도 사용될 수 있다.
//그 반대는 불가능하다. 왜냐하면 앵무새는 새지만, 모든 새가 앵무새는 아니기 떄문이다.
//따라서, 상위(부모)클래스의 인스턴스는 하위(자식)클래스의 인스턴스로 사용될 수 없다.
//Bird p1 = new parrot(o), Parrot p1 = new Bird(x)
class Person{}
class Student extends Person{}

public class ExamPolymorphism {
    public static void main(String[] args) {
        //[1]
        Student s1 = new Student();//지극히 정상
        //[2] 타입을 부모타입으로 생성
        Person s2 = new Student(); //정상->자식 클래스로 객체를 만들면서, 타입은 부모타입을 쓰는 것은 가능(다형성)
        //[3]
        Person aaa = new Person(); //지극히 정상
        //[4]불가능->상위클래스로 객체를 생성하면서 타입을 자식클래스로 쓸 수는 없다.
        //Student bbb = new Person()

    }
}
