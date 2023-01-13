public class LibraryMain {
    public static void main(String[] args) throws Exception {
        Book book = new Book();
        Student student = new Student();
        BookTransaction bookTransaction = new BookTransaction();

        System.out.println("\n========================================\n");
        System.out.println("Book Class Setters/Getters");
        System.out.println("\nBook #1");
        System.out.println("Book Code: " + book.getBookCode());
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Genre: " + book.getGenre());
        System.out.println("Book Publisher: " + book.getPublisher());
        System.out.println("Book Year Publish: " + book.getYearPublish());
        System.out.println("Book Edition: " + book.getEdition());
        
        book.setBookCode(19435937);
        book.setTitle("The Light Pirate");
        book.setAuthor("Lily Brooks-Dalton");
        book.setGenre("Fiction");
        book.setPublisher("Goodreads");
        book.setYearPublish(2021);
        book.setEdition(1);

        System.out.println("\nBook #2");
        System.out.println("Book Code: " + book.getBookCode());
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Genre: " + book.getGenre());
        System.out.println("Book Publisher: " + book.getPublisher());
        System.out.println("Book Year Publish: " + book.getYearPublish());
        System.out.println("Book Edition: " + book.getEdition());

        System.out.println("\n========================================\n");

        System.out.println("Student Class Setters/Getters");

        System.out.println("\nStudent #1");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Year: " + student.getYear());
        System.out.println("Student Level: " + student.getLevel());
        System.out.println("Student Block: " + student.getBlock());
        System.out.println("Student Course: " + student.getCourse());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Gender: " + student.getGender());
        System.out.println("Student Contact Number: " + student.getContactNumber());

        student.setStudentId(1037484624);
        student.setName("Clarise, Za, Doe");
        student.setYear(3);
        student.setLevel(4);
        student.setBlock(1);
        student.setCourse("BSCS");
        student.setAddress("East Drive Ayala Center, Makati");
        student.setGender("Female");
        student.setContactNumber("09783641976");

        System.out.println("\nStudent #2");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Year: " + student.getYear());
        System.out.println("Student Level: " + student.getLevel());
        System.out.println("Student Block: " + student.getBlock());
        System.out.println("Student Course: " + student.getCourse());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Gender: " + student.getGender());
        System.out.println("Student Contact Number: " + student.getContactNumber());

        System.out.println("\n========================================\n");

        System.out.println("Book Transaction Class Setters/Getters");

        System.out.println("\nTransaction Book #1");
        System.out.println("Book Transaction Number: " + bookTransaction.getTransNumber());
        System.out.println("Book Student ID: " + bookTransaction.getStudentID());
        System.out.println("Book date: " + bookTransaction.getDate());
        System.out.println("Book Code: " + bookTransaction.getBookCode());
        System.out.println("Book Date Borrowed: " + bookTransaction.getDateBorrowed());
        System.out.println("Book Date Return: " + bookTransaction.getDateReturn());
        System.out.println("Book Penalty: " + bookTransaction.getPenalty());

        bookTransaction.setTransNumber(17231585);
        bookTransaction.setStudentID(14260182);
        bookTransaction.setDate("December 17, 2021");
        bookTransaction.setBookCode("13793157912");
        bookTransaction.setDateBorrowed("November 4, 2022");
        bookTransaction.setDateReturn("January 5, 2022");
        bookTransaction.setPenalty(true);

        System.out.println("\nTransaction Book #2");
        System.out.println("Book Transaction Number: " + bookTransaction.getTransNumber());
        System.out.println("Book Student ID: " + bookTransaction.getStudentID());
        System.out.println("Book date: " + bookTransaction.getDate());
        System.out.println("Book Code: " + bookTransaction.getBookCode());
        System.out.println("Book Date Borrowed: " + bookTransaction.getDateBorrowed());
        System.out.println("Book Date Return: " + bookTransaction.getDateReturn());
        System.out.println("Book Penalty: " + bookTransaction.getPenalty());

        System.out.println("\n========================================\n");
    }
}