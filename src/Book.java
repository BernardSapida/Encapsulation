public class Book {
    private int bookCode = 10210381;
    private String title = "Anastasia";
    private String author = "Sophie Lark";
    private String genre = "Fantasy";
    private String publisher = "Goodreads";
    private int yearPublish = 2022;
    private int edition = 1;

    // Setters
    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    // Getters
    public int getBookCode() {
        return this.bookCode;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getYearPublish() {
        return this.yearPublish;
    }

    public int getEdition() {
        return this.edition;
    }
}
