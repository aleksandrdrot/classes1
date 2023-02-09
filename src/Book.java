public class Book {
    private int publishingYear;
    private String bookName;
    private Author author;



    public Book(Author author, String bookName, int publishingYear){
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
    public Author getAuthor(){
        return author;
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
