public class Student {
    private int studentId = 1020319131;
    private String name = "Macky, Villanueva, Orpilla";
    private int year = 2;
    private int level = 2;
    private int block = 4;
    private String course = "BSIT";
    private String address = "#74 Pasileng Norte";
    private String gender = "Male";
    private String contactNumber = "09927260359";

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getters
    public int getStudentId() {
        return this.studentId;
    }
    
    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getLevel() {
        return this.level;
    }

    public int getBlock() {
        return this.block;
    }

    public String getCourse() {
        return this.course;
    }

    public String getAddress() {
        return this.address;
    }

    public String getGender() {
        return this.gender;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }
}
