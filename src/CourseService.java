import java.util.ArrayList;
import java.util.List;

public class CourseService implements ICourseService {
    private CourseFileService service = new CourseFileService();
    private List<Student> studentlist = getStudents();
    private List<Course> courselist = getCourses();
    private List<Course> listofcourses = new ArrayList<>();
    
    @Override
    public List<Student> getStudents() {
        try {
            return service.readStudentsFromFile("./Files/Students.txt");
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public List<Course> getCourses() {
        try {
            return service.readCoursesFromFile("./Files/Courses.txt");
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public Student getStudentbyId(long studentId) {
        try {
            Student K = null;
            for(Student S : studentlist) {
                if(S.getId() == studentId) {
                    K = S;
                }
            }
            return K;
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public Course getCoursebyId(long courseId) {
        try {
            Course K = null;
            for(Course C : courselist) {
                if(C.getId() == courseId) {
                    K = C;
                }
            }
            return K;
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
        try {
            for(Course K : courselist) {
                List<Student> listofstudents = K.getStudentList();
                for(Student S : listofstudents) {
                    if(S.getId() == studentId) {
                        listofcourses.add(K);
                    }
                }
            }
            return listofcourses;
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        try {
            getCoursebyId(courseId).addStudent(getStudentbyId(studentId));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
