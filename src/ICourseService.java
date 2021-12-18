import java.util.List;

public interface ICourseService {
    List<Student> getStudents();
    List<Course> getCourses();
    Student getStudentbyId(long studentId);
    Course getCoursebyId(long courseId);
    List<Course> getCoursesOfStudent(long studentId);
    boolean addStudentToCourse(long studentId, long courseId);
}
