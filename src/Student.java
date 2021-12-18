import java.util.Random;

public class Student {
    private long id;
    private String fname;
    private String lname;
    Random r = new Random();

    public Student() {
    }
    public Student(String fname, String lname) {
        this.id = r.nextLong();
        this.fname = fname;
        this.lname = lname;
    }
    public long getId() {
        return this.id;
    }
    public String getFname() {
        return this.fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    @Override
    public String toString() {
        return lname +" "+ fname;
    }

}
