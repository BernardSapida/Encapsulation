public class MainBook {
    public static void main(String[] args) throws Exception {
        BookList BL = new BookList();

        while(true) {
            System.out.println("\n========================================\n");
            BL.insertBookList();
            System.out.println("\n========================================\n");
            BL.displayBookList();
            System.out.println("\n========================================\n");
            BL.insertBorrowedBooks();
            System.out.println("\n========================================\n");
            BL.displayBorrowedBooks();
        }
    }
}