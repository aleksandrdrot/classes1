public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Толстой", "Лев","Николаевич","Война и мир", 1975);
        Book book2 = new Book("Пушкин", "Александр", "Сергеевич","Сборник стихов", 1978);


        System.out.println("Книга1 "+ book1.getAuthor() + " " + book1.authors.getFirstName() + " " + book1.authors.getLastName() + " " + book1.getBookName() + " " + book1.getPublishingYear());
        System.out.println("Книга2 "+ book2.getAuthor() + " " + book2.authors.getFirstName() + " " + book2.authors.getLastName() + " " + book2.getBookName() + " " + book2.getPublishingYear());
        book2.setPublishingYear(1925);
        System.out.println("Книга2 "+ book2.getAuthor() + " " + book2.authors.getFirstName() + " " + book2.authors.getLastName() + " " + book2.getBookName() + " " + book2.getPublishingYear());

    }

}