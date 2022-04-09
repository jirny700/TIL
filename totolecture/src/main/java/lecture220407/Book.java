package lecture220407;

public class Book {
    String title;
    int price;
    String author;

    public Book(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "title =" + title + "price=" + price;
    }

    @Override
    public boolean equals(Object obj) {
        Book obj1= (Book)obj;
        return title.equals(obj1.title);
    }

    @Override
    public int hashCode() {
        return price*2;
    }
}
