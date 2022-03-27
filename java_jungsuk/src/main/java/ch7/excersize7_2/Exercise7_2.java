package ch7.excersize7_2;

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        /* (1) 배열 SutdaCard를 적절히 초기화 하시오. */
        cards[0] = new SutdaCard(1, true);
        cards[1] = new SutdaCard(2, false);
        cards[2] = new SutdaCard(3, true);
        cards[3] = new SutdaCard(4, false);
        cards[4] = new SutdaCard(5, false);
        cards[5] = new SutdaCard(6, false);
        cards[6] = new SutdaCard(7, false);
        cards[7] = new SutdaCard(8, true);
        cards[8] = new SutdaCard(9, false);
        cards[9] = new SutdaCard(10, false);
        cards[10] = new SutdaCard(1, false);
        cards[11] = new SutdaCard(2, false);
        cards[12] = new SutdaCard(3, false);
        cards[13] = new SutdaCard(4, false);
        cards[14] = new SutdaCard(5, false);
        cards[15] = new SutdaCard(6, false);
        cards[16] = new SutdaCard(7, false);
        cards[17] = new SutdaCard(8, false);
        cards[18] = new SutdaCard(9, false);
        cards[19] = new SutdaCard(10, false);
    }

    public SutdaCard pick() {
        int i = (int) (Math.random() * 19);
        return cards[i];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override // 오버라이딩 : 부모클래스 혹은 인터페이스에 존재하는 메서드를 다른 형식으로 재정의 하는 것
    public String toString() {
        return num + (isKwang ? "K" : "") + "^^ ";
    }
}