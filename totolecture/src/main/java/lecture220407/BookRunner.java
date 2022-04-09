package lecture220407;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book("나의 라임 오렌지 나무", 19000, "바스콘 셀로스");
        Book b2 = new Book("개미", 1000, "베르나르 베르베르");

        System.out.println("b1.toString() = " + b1.toString());
        System.out.println("b1.hashCode() = " + b1.hashCode());

        System.out.println("b2.toString() = " + b2.toString());
        System.out.println("b2.hashCode() = " + b2.hashCode());

        System.out.println("b1.equals(b2) = " + b1.equals(b2));
        System.out.println("b1.equals(b1) = " + b1.equals(b1));
    }
}
