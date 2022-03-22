package ch6;

public class Exercise6_1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(1, true);//객체 만드는 방법
        SutdaCard card2 = new SutdaCard(2, false);
        SutdaCard card3 = new SutdaCard(3, true);

        String info1= card1.info();
        System.out.println(info1);
        card1.info();
        card2.info();//카드2,3이 출력이 안되는 이유는 사용을 안해서?
        card3.info();
        card1.kwangInfo();
        card2.kwangInfo();
        card3.kwangInfo();
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {//생성자
        this.num = num;
        this.isKwang = isKwang;

    }

    String info() {//섯다카드라는 객체의 메소드를 하나 만든것/ 생성자와의 차이점은 void라는 반환값이 있는 것.
        return num + (isKwang ? "k" : "");
    }

    public void kwangInfo() {
        System.out.println(isKwang);
    }
}