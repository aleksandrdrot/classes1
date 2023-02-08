public class Book {
    private int publishingYear;
    private String bookName;
    public Author author;


    public Book(String firstName, String lastName, String bookName, int publishingYear){
        author = new Author(firstName, lastName);
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
