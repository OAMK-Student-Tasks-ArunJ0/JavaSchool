import java.io.FileNotFoundException;
import java.util.List;

public interface ICourseFileService {
    List<Student> readStudentsFromFile(String filepath) throws FileNotFoundException;
    List<Course> readCoursesFromFile(String filepath) throws FileNotFoundException;
}
