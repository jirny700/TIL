package lecture220324;

public class BitOperation {
    public static void main(String[] args) {
        int a = 4;
        int b = a >> 1; //쉬프트 연산자: 2의 1승으로 나눈다.
        System.out.println(b);

        int c = 4;
        int d = c << 1;//쉬프트 연산자: 2의 1승을 곱한다.
        System.out.println(d);
    }
}
