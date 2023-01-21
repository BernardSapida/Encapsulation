import java.util.*;

public class BookList extends BookClass implements Book {
    ArrayList<HashMap> bookList = new ArrayList<HashMap>();
    ArrayList<HashMap> borrowedBooks = new ArrayList<HashMap>();

    public void insertBookList() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> book = new HashMap<String, String>();

        System.out.println("*** Insert Books ***\n");

        System.out.print("Book Code: ");
        String bookCode = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Genre: ");
        String genre = sc.nextLine();

        System.out.print("Publisher: ");
        String publisher = sc.nextLine();

        System.out.print("Year Publish: ");
        String yearPublish = sc.nextLine();

        System.out.print("Book Edition: ");
        String bookEdition = sc.nextLine();

        super.setBookCode(bookCode);
        super.setTitle(title);
        super.setAuthor(author);
        super.setGenre(genre);
        super.setPublisher(publisher);
        super.setYearPublish(yearPublish);
        super.setEdition(bookEdition);

        book.put("Book Code", super.getBookCode());
        book.put("Title", super.getTitle());
        book.put("Author", super.getAuthor());
        book.put("Genre", super.getGenre());
        book.put("Publisher", super.getPublisher());
        book.put("Year Publish", super.getYearPublish());
        book.put("Edition", super.getEdition());

        bookList.add(book);
    }

    public void insertBorrowedBooks() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> borrowedBook = null;

        System.out.println("*** Book to borrow ***\n");
        System.out.print("Book Title: ");
        String title = sc.nextLine();

        for(HashMap book : bookList) {
            if(book.get("Title").equals(title)) borrowedBook = book;
        }

        if(borrowedBook != null) {
            System.out.print("Date Borrowed: ");
            String dateBorrowed = sc.nextLine();

            System.out.print("Date Return: ");
            String dateReturn = sc.nextLine();

            borrowedBook.put("Date Borrowed", dateBorrowed);
            borrowedBook.put("Date Return", dateReturn);

            borrowedBooks.add(borrowedBook);
        } else {
            System.out.println("Not found!");
        }
    }

    public void displayBookList(){
        System.out.println("Book Lists: ");
        for(HashMap book : bookList) {
            System.out.format("\nBook Code: %s\n", book.get("Book Code"));
            System.out.format("Title: %s\n", book.get("Title"));
            System.out.format("Author: %s\n", book.get("Author"));
            System.out.format("Genre: %s\n", book.get("Genre"));
            System.out.format("Publisher: %s\n", book.get("Publisher"));
            System.out.format("Year Publish: %s\n", book.get("Year Publish"));
            System.out.format("Edition: %s\n", book.get("Edition"));
        }
    }
    
    public void displayBorrowedBooks(){
        System.out.println("Borrowed Books: ");
        for(HashMap book : borrowedBooks) {
            System.out.format("\nBook Code: %s\n", book.get("Book Code"));
            System.out.format("Title: %s\n", book.get("Title"));
            System.out.format("Author: %s\n", book.get("Author"));
            System.out.format("Genre: %s\n", book.get("Genre"));
            System.out.format("Publisher: %s\n", book.get("Publisher"));
            System.out.format("Year Publish: %s\n", book.get("Year Publish"));
            System.out.format("Edition: %s\n", book.get("Edition"));
            System.out.format("Date Borrowed: %s\n", book.get("Date Borrowed"));
            System.out.format("Date Return: %s\n", book.get("Date Return"));
        }
    }
}
