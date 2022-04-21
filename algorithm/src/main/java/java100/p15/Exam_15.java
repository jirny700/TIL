package java100.p15;

public class Exam_15 {
    public static void main(String[] args) {
        //기본형타입->8개->변수선언과 동시에 값을 입력
        byte b = 127;
        short s=32767;
        int i=2147483647;
        long l=7000000000l;
        float f=9.8f;
        double d=3.14;
        char c='a';
        boolean bl=true;

        //출력
        System.out.println(b+"byte최댓값"+Byte.MAX_VALUE);
        System.out.println(s+"short최댓값"+Short.MAX_VALUE);
        System.out.println(i+"int최댓값"+Integer.MAX_VALUE);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bl);
    }
}
