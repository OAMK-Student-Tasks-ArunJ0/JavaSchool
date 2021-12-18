import java.util.ArrayList;
import java.util.List;

public class Course {
    protected Long id;
    protected String CourseName;
    protected String TeacherName;
    protected List<Student> StudentList = new ArrayList<>();

    public Course() {
    }
    public Long getId() {
        return this.id;
    }
    public String getCourseName() {
        return this.CourseName;
    }
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    public String getTeacherName() {
        return this.TeacherName;
    }
    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }
    public List<Student> getStudentList() {
        return this.StudentList;
    }
    public boolean addStudent(Student A) {
        try {
            this.StudentList.add(A);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean removeStudent(Student A) {
        try {
            this.StudentList.remove(A);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
