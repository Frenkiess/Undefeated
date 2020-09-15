package by.belhard.j24.homeworks.Home03;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Chuck", "Paulannik", 58);
        Book book = new Book("Fight club", 126, author);
        System.out.println(book);

    }

}
