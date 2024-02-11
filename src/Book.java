import java.util.Objects;

public class Book {
    String nameOfBook;
    int publicAge;
    String authorType;

    public Book(java.lang.String nameOfBook, int publicAge, java.lang.String authorType) {
        this.nameOfBook = nameOfBook;
        this.publicAge = publicAge;
        this.authorType = authorType;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public int getPublicAge() {
        return this.publicAge;
    }

    public int setPublicAge(int publicAge) {
        this.publicAge = publicAge;
        return this.publicAge;
    }

    public String getAuthorType() {
        return this.authorType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", publicAge=" + publicAge +
                ", authorType='" + authorType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicAge == book.publicAge && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(authorType, book.authorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, publicAge, authorType);
    }
}
