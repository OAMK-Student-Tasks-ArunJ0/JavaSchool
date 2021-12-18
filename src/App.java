import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        CourseService s = new CourseService();
        List<Student> studentlist = s.getStudents();
        List<Course> courselist = s.getCourses();
        s.addStudentToCourse(studentlist.get(0).getId(), courselist.get(0).getId());
        s.addStudentToCourse(studentlist.get(0).getId(), courselist.get(4).getId());
        s.addStudentToCourse(studentlist.get(0).getId(), courselist.get(6).getId());
        System.out.println();
        System.out.println(s.getCoursesOfStudent(studentlist.get(0).getId()));
        System.out.println();
        System.out.println(courselist.get(0).getStudentList());
        System.out.println();
    }
}
