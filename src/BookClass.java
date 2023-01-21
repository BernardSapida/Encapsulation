abstract class BookClass {
    private String bookCode = "10210381";
    private String title = "Anastasia";
    private String author = "Sophie Lark";
    private String genre = "Fantasy";
    private String publisher = "Goodreads";
    private String yearPublish = "2022";
    private String edition = "1";
    private String dateBorrowed = "December 4, 2022";
    private String dateReturn = "January 13, 2023";

    // Setters
    public void setBookCode(String bookCode) {
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

    public void setYearPublish(String yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    // Getters
    public String getBookCode() {
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

    public String getYearPublish() {
        return this.yearPublish;
    }

    public String getEdition() {
        return this.edition;
    }

    public String getDateBorrowed() {
        return this.dateBorrowed;
    }

    public String getDateReturn() {
        return this.dateReturn;
    }
}
