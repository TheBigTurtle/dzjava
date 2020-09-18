package ex2;

public class Book {
    private double weight;
    private int numPages;
    private String bookTitle;
    private String genre;

    public Book(double weight, int numPages, String bookTitle, String genre ){
        this.numPages = numPages;
        this.weight = weight;
        this.genre = genre;
        this.bookTitle = bookTitle;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumPages (int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book title='" + bookTitle + '\'' +
                "genre='" + genre + '\'' +
                '}';
    }

    void printBookInfo(){
        System.out.println(weight);
        System.out.println(numPages);
    }
}
