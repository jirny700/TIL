package udemyclass.section8;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(10);
        Book effectiveJava = new Book(10);
        Book cleanCode = new Book(10);

        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);


    }
}
