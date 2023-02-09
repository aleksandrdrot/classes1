public class Main {
    public static void main(String[] args) {

        Book book1 = new Book( new Author("Толстой", "Лев","Николаевич"),"Война и мир", 1975);
        Book book2 = new Book( new Author("Пушкин", "Александр", "Сергеевич"),"Сборник стихов", 1978);


        System.out.println("Книга1 "+ book1.getAuthor().getLastName() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getMiddleName() + " " + book1.getBookName() + " " + book1.getPublishingYear());
        System.out.println("Книга2 "+ book2.getAuthor().getLastName() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getMiddleName() + " " + book2.getBookName() + " " + book2.getPublishingYear());
        book2.setPublishingYear(1925);
        System.out.println("Книга2 "+ book2.getAuthor().getLastName() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getMiddleName() + " " + book2.getBookName() + " " + book2.getPublishingYear());

    }

}