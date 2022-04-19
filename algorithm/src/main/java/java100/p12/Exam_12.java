package java100.p12;

public class Exam_12 {
    public static void main(String[] args) {
       //byte,short,int,long,char
        System.out.println(Byte.BYTES);//바이트계산
        System.out.println(Byte.SIZE);//비트계산
        System.out.println(Byte.MAX_VALUE);//최댓값
        System.out.println(Byte.MIN_VALUE);//최솟값

        System.out.println("byte:"+ Byte.BYTES+ "(바이트)"+"-->"+Byte.SIZE+"(비트)"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println("short:"+ Short.BYTES+ "(바이트)"+"-->"+Short.SIZE+"(비트)"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        System.out.println("int:"+ Integer.BYTES+ "(바이트)"+"-->"+Integer.SIZE+"(비트)"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        System.out.println("long:"+ Long.BYTES+ "(바이트)"+"-->"+Long.SIZE+"(비트)"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
        System.out.println("char:"+ Character.BYTES+ "(바이트)"+"-->"+Character.SIZE+"(비트)"+(int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);

    }
}

//**자바의 자료형(데이터타입)
//
//1.크게 봤을때-->기본형타입, 참조형타입
//
//2.기본형 타입(Primitive data type)-->8개
//-->정수형-->byte(1),short(2),int(4),long(8)
//-->실수형-->float(4),double(8)
//-->문자형-->char(2),문자한개-->참고로, 문자열을 다루는 타입은 없다.
//-->논리형(참/거짓)-->boolean(1)-->true,false
//
//3.참조형타입(reference date type)-->위 기본형에 속하지 않는 데이터들.
//-->대표적으로, 클래스(class), 배열(array), 인터페이스(interface), 문자열(String /immutable)
//-->특징: 데이터가 저장된 메뢰의 주소값을 저장하는 변수이다.