package java100.p74;

class Person{
    String str1 = "난 부모 클래스";
    void method1(){
        System.out.println("에이에이에이");
    }
    void ppp(){
        System.out.println("ppp");
    }
}

class Student extends Person{
    String str2 = "난 자식 클래스";
    void method1(){
        System.out.println("오버라이딩-AAA");
    }
    void sss(){
        System.out.println("sss");
    }
    void x(){
        method1();
        super.method1();
    }
}

public class ExamPolymorphism2 {
    public static void main(String[] args) {
        //[1] 객체생성->부모+자식 클래스의 모든 자원을 다 쓸 수 있다.
        Student s1 = new Student();
        System.out.println(s1.str1);
        System.out.println(s1.str2);
        s1.method1(); //오버라이딩 - AAA
        s1.sss();
        //[!]:그런데 말이죠..-->자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면?
        //super사용!
        System.out.println("---super사용");
        s1.x();

        //[2]: 객체생성->범위는 부모의 지원만을 쓸 수 있다(?)
        Person s2 = new Student();
        System.out.println(s2.str1);
        //System.out.println(s2.str2); // err->자식의 자원은 쓸 수 없다.
        s2.ppp(); //ppp
        //s2.sss(); //err->자식의 자원은 쓸 수 없다.
        s2.method1(); //오버라이딩-AAA(오버라이딩한거는 자식의 메서드로 실행)
        //[!]: 그런데 말이죠..-->자식의 메서드를 바로 호출하고 싶다면?
        //캐스트 필요!
        System.out.println("---캐스트필요");
        ((Student)s2).sss(); //sss

        //[3]: 객체생성
        Person aaa = new Person();
        aaa.method1(); //에이에이에이
        aaa.ppp();


        //Student bbb = new Person(); ->err
    }
}
