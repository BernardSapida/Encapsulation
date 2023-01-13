public class BookTransaction {
    private int transNumber = 95198068;
    private int studentID = 10210381;
    private String date = "September 15, 2021";
    private String bookCode = "10521230123";
    private String dateBorrowed = "December 4, 2022";
    private String dateReturn = "January 13, 2023";
    private boolean penalty = false;

    // Setters
    public void setTransNumber(int transNumber) {
        this.transNumber = transNumber;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    // Getters
    public int getTransNumber() {
        return this.transNumber;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String getDate() {
        return this.date;
    }

    public String getBookCode() {
        return this.bookCode;
    }

    public String getDateBorrowed() {
        return this.dateBorrowed;
    }

    public String getDateReturn() {
        return this.dateReturn;
    }

    public boolean getPenalty() {
        return this.penalty;
    }
}
