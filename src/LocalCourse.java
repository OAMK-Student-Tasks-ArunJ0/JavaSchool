import java.util.Random;

public class LocalCourse extends Course {
    Random r = new Random();
    private String CourseLoc;

    public LocalCourse() {
    }
    public LocalCourse(String CourseName, String TeacherName, String CourseLoc) {
        this.id = r.nextLong();
        this.CourseLoc = CourseLoc;
        this.TeacherName = TeacherName;
        this.CourseName = CourseName;
    }
    public String getCourseLoc() {
        return this.CourseLoc;
    }
    public void setCourseLoc(String CourseLoc) {
        this.CourseLoc = CourseLoc;
    }
    @Override
    public boolean addStudent(Student A) {
        try {
            if(StudentList.size()<25){
                this.StudentList.add(A);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public String toString() {
        return CourseName+" - "+TeacherName+" - "+CourseLoc;
    }
}
