public class Book {
    private int publishingYear;
    private String bookName;


    public Book(String bookName, int publishingYear){
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName(){
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
