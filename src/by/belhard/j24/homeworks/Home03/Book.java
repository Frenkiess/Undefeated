package by.belhard.j24.homeworks.Home03;

public class Book {

    private String name;
    private int number;
    private Author author;

    public Book(String name, int number, Author author) {
        this.name = name;
        this.number = number;
        this.author = author;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", author=" + author +
                '}';
    }
}
