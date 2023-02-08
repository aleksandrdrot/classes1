public class Main {
    public static void main(String[] args) {

        Book tolstoyBook = new Book("Лев","Толстой","Война и мир", 1975);
        Book pushkinBook = new Book("Александр", "Пушкин","Сборник стихов", 1978);


        System.out.println("Книга1 "+ tolstoyBook.author.getFirstName() + " " + tolstoyBook.author.getLastName() + " " + tolstoyBook.getBookName() + " " + tolstoyBook.getPublishingYear());
        System.out.println("Книга2 "+ pushkinBook.author.getFirstName() + " " + pushkinBook.author.getLastName() + " " + pushkinBook.getBookName() + " " + pushkinBook.getPublishingYear());
        pushkinBook.setPublishingYear(1925);
        System.out.println("Книга2 "+ pushkinBook.author.getFirstName() + " " + pushkinBook.author.getLastName() + " " + pushkinBook.getBookName() + " " + pushkinBook.getPublishingYear());

    }

}