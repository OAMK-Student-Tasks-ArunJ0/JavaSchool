import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseFileService implements ICourseFileService {
    private String Term1, Term2, Term3;
    private List<Student> studentlist = new ArrayList<>();
    private List<Course> courselist = new ArrayList<>();
    
    @Override
    public List<Student> readStudentsFromFile(String filepath) throws FileNotFoundException {
        try {
            File f = new File(filepath);
            Scanner FileScanner = new Scanner(f);
            while(FileScanner.hasNextLine()) {
                String row = FileScanner.nextLine();
                int i = row.lastIndexOf("---");
                Term1 = row.substring(0, i);
                Term2 = row.substring(i);
                Term2 = Term2.replaceAll("---", "");
                Student student = new Student(Term1, Term2);
                studentlist.add(student);
            }
            FileScanner.close();
            return studentlist;
        } catch(Exception e) {
            return null;
        }
    }
    @Override
    public List<Course> readCoursesFromFile(String filepath) throws FileNotFoundException {
        try {
            File f = new File(filepath);
            Scanner FileScanner = new Scanner(f);
            while(FileScanner.hasNextLine()) {
                String row = FileScanner.nextLine();
                int i = row.lastIndexOf("---");
                int k = row.lastIndexOf("___");
                Term1 = row.substring(0, i);
                Term2 = row.substring(i, k);
                Term3 = row.substring(k);
                Term2 = Term2.replaceAll("---", "");
                Term3 = Term3.replaceAll("___", "");

                if(row.contains("===online")) {
                    Term3 = Term3.replaceAll("===online","");
                    OnlineCourse oCourse = new OnlineCourse(Term1, Term2, Term3);
                    courselist.add(oCourse);
                } else {
                    LocalCourse lCourse = new LocalCourse(Term1, Term2, Term3);
                    courselist.add(lCourse);
                }
            }
            FileScanner.close();
            return courselist;
        } catch(Exception e) {
            return null;
        }
    }
}
