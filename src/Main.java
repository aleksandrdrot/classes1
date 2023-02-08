public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");
        Book tolstoyBook = new Book("Война и мир", 1975);
        Book pushkinBook = new Book("Сборник стихов", 1978);


        System.out.println("Книга1 "+ tolstoy.getFirstName() + " " + tolstoy.getLastName() + " " + tolstoyBook.getBookName() + " " + tolstoyBook.getPublishingYear());
        System.out.println("Книга2 "+ pushkin.getFirstName() + " " + pushkin.getLastName() + " " + pushkinBook.getBookName() + " " + pushkinBook.getPublishingYear());
        pushkinBook.setPublishingYear(1925);
        System.out.println("Книга2 "+ pushkin.getFirstName() + " " + pushkin.getLastName() + " " + pushkinBook.getBookName() + " " + pushkinBook.getPublishingYear());
    }

}