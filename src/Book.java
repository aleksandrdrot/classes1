public class Book {
    private int publishingYear;
    private String bookName;
    private String author;
    public Author authors;


    public Book(String author, String firstName, String middleName, String bookName, int publishingYear){
        authors = new Author(firstName, middleName);
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
    public String getAuthor(){return author;}

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
