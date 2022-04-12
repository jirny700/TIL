package udemyclass.section8;

public class Book {
    private int noOfCopies;

    Book(int noOfCopies){
        this.noOfCopies=noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies+howMuch);
    }
    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies-howMuch);
    }
}
